package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;


@JsType(isNative = true, name="Object", namespace = JsPackage.GLOBAL)
public class PaypalButtonConfiguration {
	
	@JsOverlay
	public static PaypalButtonConfiguration of(CreateOrderInterface createOrder, OnApproveInterface onApprove) {
		PaypalButtonConfiguration config = new PaypalButtonConfiguration();
		config.createOrder = createOrder;
		config.onApprove = onApprove;
		return config;
	}
	
	public CreateOrderInterface createOrder;
	
	public OnApproveInterface onApprove;
}
