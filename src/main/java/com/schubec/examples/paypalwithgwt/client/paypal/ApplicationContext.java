package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ApplicationContext {

	@JsOverlay
	public static ApplicationContext of(String locale, String brand_name, String shipping_preference){
		ApplicationContext applicationContext = new ApplicationContext();
		applicationContext.locale = locale;
		applicationContext.brand_name = brand_name;
		applicationContext.shipping_preference = shipping_preference;

		return applicationContext;
	}

	public String locale;

	public String brand_name;

	public String shipping_preference;

}
