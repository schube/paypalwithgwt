# paypalwithgwt


start with:
    
    mvn gwt:devmode
    
    
    
# Status quo

PaypalJSNI works, but it uses JSNI, as the name indicates. This is the code.


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

I want the project to use JSInterop.
Unfortunately, I do not know how yet, but I am learning.

The paypal button shows up with this basic code:

	Paypal.PaypalButton b = Paypal.Buttons(null);
	b.render("body");

But I want to provide options to the "createOrder" method, and I do not know how.