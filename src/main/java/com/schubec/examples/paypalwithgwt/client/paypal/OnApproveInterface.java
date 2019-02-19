package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsFunction;
import jsinterop.base.JsPropertyMap;

@JsFunction
public interface OnApproveInterface {
	Order onApprove(JsPropertyMap<String> data, Action actions);
}
