package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class PPApplicationContext {

	@JsProperty
	public String locale;

	@JsProperty
	public String brand_name;

	@JsProperty
	public String shipping_preference;

}
