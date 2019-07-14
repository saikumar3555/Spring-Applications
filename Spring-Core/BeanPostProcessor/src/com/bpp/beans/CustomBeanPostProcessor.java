package com.bpp.beans;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object obj, String name) throws BeansException {
		System.out.println("Before initialization :" + obj);
		if (obj instanceof PrintMsg) {
			PrintMsg pm = (PrintMsg) obj;
			pm.setCreatedDt(new Date());
		}
		return obj;
	}

	@Override
	public Object postProcessAfterInitialization(Object obj, String name) throws BeansException {
		System.out.println("AFter initializaton :" + obj);
		if (obj instanceof PrintMsg) {
			PrintMsg pm = (PrintMsg) obj;
			pm.setModifiedDt(new Date());
		}
		return obj;
	}
}
