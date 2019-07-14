package com.sdp.beans;

import java.io.Serializable;

public class DateFormatter implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5849002023826119576L;

	// Don't delete this
	private DateFormatter() {

	}

	private static DateFormatter instance = null;

	public static DateFormatter getInstance() {
		if (instance == null) {
			synchronized (DateFormatter.class) {
				// double-checking
				if (instance == null)
					instance = new DateFormatter();
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}
}
