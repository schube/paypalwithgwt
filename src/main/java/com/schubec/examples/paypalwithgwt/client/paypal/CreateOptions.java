package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class CreateOptions {

	@JsOverlay
	public static CreateOptions of(ApplicationContext applicationContext, Payer payer, PurchaseUnit purchaseUnit) {
		CreateOptions createOptions = new CreateOptions();
		createOptions.application_context = applicationContext;
		createOptions.purchase_units = new PurchaseUnit[] { purchaseUnit };
		createOptions.payer = payer;
		return createOptions;
	}

	public ApplicationContext application_context;

	public Payer payer;

	public PurchaseUnit[] purchase_units;
}
