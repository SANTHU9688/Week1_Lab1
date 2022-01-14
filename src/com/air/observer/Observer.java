package com.air.observer;

import com.info.beans.Guest;

public interface Observer {
	
	public void registerUser(Guest customers);
	
	public void notifyUser(String msg,String playerName);

}
