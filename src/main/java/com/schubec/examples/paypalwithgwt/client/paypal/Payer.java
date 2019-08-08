package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Payer {

    @JsOverlay
    public static Payer of(String email_address, Name name, Address address){
        Payer payer = new Payer();
        payer.email_address = email_address;
        payer.name = name;
        payer.address = address;
        return payer;
    }

    public String email_address;
    public Name name;
    public Address address;
}
