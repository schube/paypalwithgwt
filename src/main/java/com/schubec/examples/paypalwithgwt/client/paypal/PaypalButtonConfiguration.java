package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;


@JsType(isNative = true, name="Object", namespace = JsPackage.GLOBAL)
public class PaypalButtonConfiguration {
	public native void createOrder(Object data, ActionCallback fn);
	public native void onApprove(Object data, ActionCallback fn);
}
