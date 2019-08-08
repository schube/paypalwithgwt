package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Name {

    @JsOverlay
    public static Name of(String surname, String given_name){
        Name name = new Name();
        name.given_name = given_name;
        name.surname = surname;
        return name;
    }

    public String given_name;
    public String surname;
}
