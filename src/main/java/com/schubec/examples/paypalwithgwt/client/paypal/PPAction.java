package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class PPAction {
	@JsProperty(name = "order")
	public PPOrder order;
}
