package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface PPCreateOrderInterface {
	PPOrder createOrder(Object data, PPAction actions);
}
