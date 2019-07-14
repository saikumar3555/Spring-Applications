package com.sdp.bean;

import java.lang.reflect.Method;

public class TestDemo {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.sdp.bean.Demo");
		Object obj = c.newInstance();
		Method m = c.getDeclaredMethod("m2");
		m.setAccessible(true);
		m.invoke(obj);
	}

}
