package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;
import jsinterop.annotations.JsPackage;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name="order")
public class Order {

	

	public native Order create(CreateOptions options);

	public native Order capture();
}
