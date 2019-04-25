# paypalwithgwt

This is a sample project which shows how PayPal JS SDK can be integrated into a GWT app.

It also serves as an example for JSInterop.

Thank you Ahmad K. Bawaneh and Colin Alworth for your help (or better: for all the hard/main work). My contribution to the project is very small.

## Config

In src/main/webapp/PaypalWithGTW.html find
	
	<script src="https://www.paypal.com/sdk/js?client-id=SB_CLIENT_ID&currency=EUR"></script>

and replace `SB_CLIENT_ID` with your own cliend-id (any maybe change the currency setting).

Get your client id from the Paypal Developer portal. Follow the guide here: https://developer.paypal.com/docs/checkout/integrate/

Create a sandbox buyer account, so you can "buy" stuff in the Paypal sandbox environment by paying with "virtual money".

## Run application:

Start the application with:
    
    mvn gwt:devmode
    
