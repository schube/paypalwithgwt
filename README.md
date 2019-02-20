# paypalwithgwt

## Config

In src/main/webapp/PaypalWithGTW.html find
	
	<script src="https://www.paypal.com/sdk/js?client-id=SB_CLIENT_ID&currency=EUR"></script>

and replace `SB_CLIENT_ID` with your own cliend-id (any maybe change the currency setting).

Get your client id from the Paypal Developer portal. Follow the guide here: https://developer.paypal.com/docs/checkout/integrate/

Create a sandbox buyer account, so you can "buy" stuff in the Paypal sandbox environment by paying with "virtual money".

## Run application:

Start the application with:
    
    mvn gwt:devmode
    
