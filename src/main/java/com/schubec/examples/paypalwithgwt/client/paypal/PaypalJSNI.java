package com.schubec.examples.paypalwithgwt.client.paypal;

public class PaypalJSNI {

    
    public static native void render(String renderTarget, double amount, String anmeldeId) /*-{
    	
    	$wnd.paypal.Buttons({
		    createOrder: function(data, actions) {
		      return actions.order.create({
				  "application_context":{
				    "locale":"de-DE",
				    "brand_name":"LieMudRun",
				    "shipping_preference":"NO_SHIPPING"				    
				  },
		        purchase_units: [{
		          "reference_id": anmeldeId,
		          "description":"Tickets LieMudRun",
		          amount: {
		            value: amount
		          }
		        }]
		      });
		    },
		    onApprove: function(data, actions) {
		      return actions.order.capture().then(function(details) {
		        alert('Transaction completed by ' + details.payer.name.given_name);
		        return fetch('http://localhost:8887/LiMudRun_htdocs/rest/paypal-transaction-complete.php', {
		          method: 'post',
		          body: JSON.stringify({
		            orderID: data.orderID
		          })
		        });
		      });
		    }
		  }).render(renderTarget);
    }-*/;
    
}
