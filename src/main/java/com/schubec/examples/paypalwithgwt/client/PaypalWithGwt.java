package com.schubec.examples.paypalwithgwt.client;

import org.fusesource.restygwt.client.Defaults;
import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.TextCallback;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.schubec.examples.paypalwithgwt.client.paypal.*;
import com.schubec.examples.paypalwithgwt.client.rest.PaypalRestService;

import elemental2.core.Global;

public class PaypalWithGwt implements EntryPoint {
    public void onModuleLoad() {
        GWT.log("onModuleLoad");

        Defaults.setAddXHttpMethodOverrideHeader(false);
        
        ApplicationContext context = ApplicationContext.of("de-DE","LieMudRun2" , "NO_SHIPPING");

        Payer payer = Payer.of("officetest@gmail.com", Name.of("SchulzTEST", "Bernhard"), Address.of("Musterstrasse","", "", "Salzburg", "5020", "AT"));
		PurchaseUnit pu = PurchaseUnit.of("123", "Tickets LieMudRun", 0.1d);

        CreateOptions options = CreateOptions.of(context, payer, pu);

        PaypalButtonConfiguration config = PaypalButtonConfiguration.of(
                (data, actions) -> actions.order.create(options),
                (data, actions) -> {
                	GWT.log(data.toString());
                	GWT.log(actions.toString());
                	Promise promise = actions.order.capture();
                	promise.then(details -> {
                		GWT.log(details.toString());
                		PaypalRestService service = GWT.create(PaypalRestService.class);
                		service.getOrder(data.get("orderID"), new TextCallback() {

							@Override
							public void onFailure(Method method, Throwable exception) {
								GWT.log(exception.toString());
								
							}

							@Override
							public void onSuccess(Method method, String response) {
								GWT.log(response);
								Global.JSON.parse(response);
							}
                			
                		});
                		
                	});
                	return null;
                }
        );

        Paypal.Buttons(config)
                .render("body");

    }
}
