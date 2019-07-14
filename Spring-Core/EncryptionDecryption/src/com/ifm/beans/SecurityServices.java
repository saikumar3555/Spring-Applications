package com.ifm.beans;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class SecurityServices {

	private String ALGO;
	private byte[] secretKey;

	public SecurityServices(String algo, byte[] secretKey) {
		this.ALGO = algo;
		this.secretKey = secretKey;
	}

	public String encrypt(String value) throws Exception {
		Key key = generateKey();
		Cipher cipher = Cipher.getInstance(ALGO);
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] arr = cipher.doFinal(value.getBytes());
		return Base64.getEncoder().encodeToString(arr);
	}

	public String decrypt(String encVal) throws Exception {
		Key key = generateKey();
		Cipher cipher = Cipher.getInstance(ALGO);
		cipher.init(Cipher.DECRYPT_MODE, key);
		byte[] arr = Base64.getDecoder().decode(encVal);
		byte[] decVal = cipher.doFinal(arr);
		return new String(decVal);
	}

	public Key generateKey() {
		return new SecretKeySpec(secretKey, ALGO);
	}

}
