package com.info.client;

import com.air.observer.OfferAlert;
import com.info.beans.Guest;
import com.info.service.Taco;
import com.info.service.TingaTaco;
import com.info.service.WithExtraCheese;
import com.info.service.WithExtraSourCream;

public class OrderTaco {

	public static void main(String[] args) {

		// Register User
		Guest c1 = new Guest("Mathew Hayden", 986629202);
		OfferAlert alert = new OfferAlert();
		alert.RegisterUser(c1);

		Taco tingaTaco = new TingaTaco();
		getTacoPreview(tingaTaco);

		tingaTaco = new WithExtraCheese(tingaTaco);
		getTacoPreview(tingaTaco);
		
		tingaTaco = new WithExtraSourCream(tingaTaco);
		getTacoPreview(tingaTaco);
		
		//Send Offer Notification to the registered user using Observer Pattern 
		alert.sendOfferNotification(c1);

	}

	private static void getTacoPreview(Taco taco) {
		System.out.println(taco.tacoCost() + ", Description  " + taco.getTacoDescription());

	}
}
