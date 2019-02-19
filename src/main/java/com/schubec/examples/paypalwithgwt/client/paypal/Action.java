package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Action {
	@JsProperty(name="order")
	public Order order;
}
