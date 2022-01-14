package com.air.observer;
import com.info.beans.Guest;

public class OfferAlert {
	
	
   Users users = new Users();
   
   public void RegisterUser(Guest customer) {
	   users.registerUser(customer);
   }
   
   public void sendOfferNotification(Guest customer) {
	   users.notifyUser(" Taco offer - Up to 5% off, Code TACO - tacoBells.com ,", customer.getName());
   }
   


}
