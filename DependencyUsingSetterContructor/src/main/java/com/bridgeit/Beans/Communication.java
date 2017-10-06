package com.bridgeit.Beans;

import com.bridgeit.domain.Message;

public class Communication {

	private Message messaging;
    /*
    * DI via Setter
    */
	public void setMessaging(Message messaging){
        this.messaging = messaging;
    }
 
    public void communicate(){
        messaging.sendMessage();
    }
	
}
