package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name="Object", namespace = JsPackage.GLOBAL)
public class PurchaseUnit {

	@JsProperty
	public String reference_id;

	@JsProperty
	public String description;

	@JsProperty
	public PurchaseUnitAmount amount;

	

}
