package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class PPButtonConfiguration {

	@JsOverlay
	public static PPButtonConfiguration of(PPCreateOrderInterface createOrder, PPOnApproveInterface onApprove) {
		PPButtonConfiguration config = new PPButtonConfiguration();
		config.createOrder = createOrder;
		config.onApprove = onApprove;
		return config;
	}

	@JsProperty
	public PPCreateOrderInterface createOrder;

	@JsProperty
	public PPOnApproveInterface onApprove;
}
