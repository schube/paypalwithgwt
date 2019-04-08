package com.schubec.examples.paypalwithgwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.schubec.examples.paypalwithgwt.client.paypal.*;

public class PaypalWithGwt implements EntryPoint {
    public void onModuleLoad() {
        GWT.log("onModuleLoad");

        ApplicationContext context = ApplicationContext.of("de-DE","LieMudRun" , "NO_SHIPPING");

        PurchaseUnit pu = PurchaseUnit.of("123", "Tickets LieMudRun", 0.1d);

        CreateOptions options = CreateOptions.of(context, pu);

        PaypalButtonConfiguration config = PaypalButtonConfiguration.of(
                (data, actions) -> actions.order.create(options),
                (data, actions) -> actions.order.capture()
        );

        Paypal.Buttons(config)
                .render("body");

    }
}
