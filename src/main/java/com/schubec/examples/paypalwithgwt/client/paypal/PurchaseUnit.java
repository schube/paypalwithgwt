package com.schubec.examples.paypalwithgwt.client.paypal;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class PurchaseUnit {

    @JsOverlay
    public static PurchaseUnit of(String reference_id, String description, double amount) {
        PurchaseUnit purchaseUnit = new PurchaseUnit();
        purchaseUnit.amount = PurchaseUnitAmount.of(amount);
        purchaseUnit.reference_id = reference_id;
        purchaseUnit.description = description;

        return purchaseUnit;
    }

    public String reference_id;

    public String description;

    public PurchaseUnitAmount amount;
}
