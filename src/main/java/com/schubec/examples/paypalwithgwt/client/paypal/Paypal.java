package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "paypal")
public class Paypal {

	@JsMethod
	public static native PaypalButton Buttons(PaypalButtonConfiguration configuration);

	public class PaypalButton {
		@JsMethod
		public native void render(String renderTarget);

	}

}
