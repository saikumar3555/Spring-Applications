package com.ifm.beans;

public class ServiceFactory {

	public SecurityServices getInstance(String s) {
		System.out.println("parameter : " + s);
		String algo = "AES";
		byte[] secretKey = new byte[] { 'T', 'H', 'E', 'B', 'E', 'S', 'T', 'S', 'E', 'C', 'R', 'E', 'T', 'K', 'E',
				'Y' };
		return new SecurityServices(algo, secretKey);
	}

}
