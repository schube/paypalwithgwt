package com.schubec.examples.paypalwithgwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.schubec.examples.paypalwithgwt.client.paypal.ApplicationContext;
import com.schubec.examples.paypalwithgwt.client.paypal.PaypalButtonConfiguration;
import com.schubec.examples.paypalwithgwt.client.paypal.CreateOptions;
import com.schubec.examples.paypalwithgwt.client.paypal.CreateOrderInterface;
import com.schubec.examples.paypalwithgwt.client.paypal.Paypal;
import com.schubec.examples.paypalwithgwt.client.paypal.PurchaseUnit;
import com.schubec.examples.paypalwithgwt.client.paypal.PurchaseUnitAmount;

import jsinterop.base.JsPropertyMap;

public class PaypalWithGwt implements EntryPoint {
	public void onModuleLoad() {
		GWT.log("onModuleLoad");

		ApplicationContext context = new ApplicationContext();
		context.brand_name = "LieMudRun";
		context.locale = "de-DE";
		context.shipping_preference = "NO-SHIPPING";

		PurchaseUnit pu = new PurchaseUnit();
		pu.reference_id = "123";
		pu.description = "Tickets LieMudRun";
		PurchaseUnitAmount pua = new PurchaseUnitAmount();
		pua.amount = 23d;
		pu.amount = pua;

		CreateOptions options = new CreateOptions();
		options.application_context = context;
		options.purchase_units = new PurchaseUnit[1];
		options.purchase_units[0] = pu;

		PaypalButtonConfiguration config = new PaypalButtonConfiguration();

		config.createOrder = (data, actions) -> {
		  return actions.order.create(options);
		};
		
		
		
		Paypal.PaypalButton b = Paypal.Buttons(config);
		b.render("body");

	}
}
