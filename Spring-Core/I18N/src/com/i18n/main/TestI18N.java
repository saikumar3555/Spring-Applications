package com.i18n.main;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestI18N {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/i18n/cfg/Beans.xml");
		String msg = ctx.getMessage("hello", new Object[] { "Raja" }, Locale.JAPANESE);
		System.out.println(msg);
	}

}
