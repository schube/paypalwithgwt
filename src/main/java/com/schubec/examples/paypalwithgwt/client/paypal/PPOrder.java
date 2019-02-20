package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "order")
public class PPOrder {

	public native PPOrder create(PPCreateOptions options);

	public native PPOrder capture();
}
