package com.bridgeit.Beans;

import com.bridgeit.domain.Encryption;

public class CommunicationConstructor {

	private Encryption encryption;
	/*
	 * DI via Constructor Injection
	 */
	public CommunicationConstructor(Encryption encryptioning) {
		this.encryption = encryptioning;
	}

	public void communicate() {
		encryption.encryptData();
	}
}
