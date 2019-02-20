package com.schubec.examples.paypalwithgwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.schubec.examples.paypalwithgwt.client.paypal.PPApplicationContext;
import com.schubec.examples.paypalwithgwt.client.paypal.PPButtonConfiguration;
import com.schubec.examples.paypalwithgwt.client.paypal.PPCreateOptions;
import com.schubec.examples.paypalwithgwt.client.paypal.PPPurchaseUnit;
import com.schubec.examples.paypalwithgwt.client.paypal.PPPurchaseUnitAmount;
import com.schubec.examples.paypalwithgwt.client.paypal.Paypal;

public class PaypalWithGwt implements EntryPoint {
	public void onModuleLoad() {
		GWT.log("onModuleLoad");

		PPApplicationContext context = new PPApplicationContext();
		context.brand_name = "LieMudRun";
		context.locale = "de-DE";
		context.shipping_preference = "NO_SHIPPING";

		PPPurchaseUnit pu = new PPPurchaseUnit();
		pu.reference_id = "123";
		pu.description = "Tickets LieMudRun";
		PPPurchaseUnitAmount pua = new PPPurchaseUnitAmount();
		pua.value = 0.1d;
		pu.amount = pua;

		PPCreateOptions options = new PPCreateOptions();
		options.application_context = context;
		options.purchase_units = new PPPurchaseUnit[1];
		options.purchase_units[0] = pu;

		PPButtonConfiguration config = new PPButtonConfiguration();

		config.createOrder = (data, actions) -> {
			return actions.order.create(options);
		};

		config.onApprove = (data, actions) -> {

			GWT.log("Order ID: " + data.get("orderID"));
			GWT.log("Payer ID: " + data.get("payerID"));
			return actions.order.capture();

		};

		Paypal.PaypalButton b = Paypal.Buttons(config);
		b.render("body");

	}
}
