package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsFunction;
import jsinterop.base.JsPropertyMap;

@JsFunction
public interface PPOnApproveInterface {
	PPOrder onApprove(JsPropertyMap<String> data, PPAction actions);
}
