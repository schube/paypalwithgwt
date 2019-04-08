package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class PurchaseUnitAmount {

    @JsOverlay
    public static PurchaseUnitAmount of(double amount){
        PurchaseUnitAmount purchaseUnitAmount = new PurchaseUnitAmount();
        purchaseUnitAmount.value = amount;
        return purchaseUnitAmount;
    }

    public double value;
}
