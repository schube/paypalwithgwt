package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name="Object", namespace = JsPackage.GLOBAL)
public class CreateOptions {

	@JsProperty
	public ApplicationContext application_context;
	
	@JsProperty
	public PurchaseUnit[] purchase_units;
}
