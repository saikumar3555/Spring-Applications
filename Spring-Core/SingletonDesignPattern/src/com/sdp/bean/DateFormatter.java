package com.sdp.bean;

import java.io.Serializable;

public class DateFormatter implements Cloneable, Serializable {

	private static DateFormatter instance = null;

	private DateFormatter() {
	}

	public static DateFormatter getInstance() {
		if (instance == null) {
			synchronized (DateFormatter.class) {
				if (instance == null) {
					instance = new DateFormatter();
				}
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		try {
			throw new Exception("Cloning not supported..!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	protected Object readResolve() {
		return instance;
	}
}
