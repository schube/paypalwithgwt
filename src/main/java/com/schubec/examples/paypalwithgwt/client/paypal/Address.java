package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Address {

	@JsOverlay
	public static Address of(String address_line_1,
			String address_line_2,
			String admin_area_1,
			String admin_area_2,
			String postal_code,
			String country_code) {
		Address address = new Address();
		address.address_line_1 = address_line_1;
		address.address_line_2 = address_line_2;
		address.admin_area_1 = admin_area_1;
		address.admin_area_2 = admin_area_2;
		address.postal_code = postal_code;
		address.country_code = country_code;

		return address;
	}

	public String address_line_1;
	public String address_line_2;
	public String admin_area_1;
	public String admin_area_2;
	public String postal_code;
	public String country_code;
}
