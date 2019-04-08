package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface CreateOrderInterface {
	Order createOrder(Object data, Action actions);
}
