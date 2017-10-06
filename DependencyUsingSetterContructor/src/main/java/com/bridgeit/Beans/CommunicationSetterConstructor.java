package com.bridgeit.Beans;

import com.bridgeit.domain.Encryption;
import com.bridgeit.domain.Message;

public class CommunicationSetterConstructor {

	private Message messaging;
    
    private Encryption encryption;
     
    /*
     * DI via Constructor Injection
     */
    public CommunicationSetterConstructor(Encryption encryption){
        this.encryption = encryption;
    }
 
    /*
     * DI via Setter
     */
    public void setMessaging(Message messaging){
        this.messaging = messaging;
    }
 
    public void communicate(){
        encryption.encryptData();
        messaging.sendMessage();
    }
	
}
