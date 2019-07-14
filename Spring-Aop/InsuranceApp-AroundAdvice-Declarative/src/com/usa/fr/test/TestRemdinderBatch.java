package com.usa.fr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.usa.fr.beans.ReminderBatch;

public class TestRemdinderBatch {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/usa/fr/cfg/Aop-Beans.xml");
		ReminderBatch rb = context.getBean("rb", ReminderBatch.class);
		rb.sendNoticationToPlanHolders();
	}

}
