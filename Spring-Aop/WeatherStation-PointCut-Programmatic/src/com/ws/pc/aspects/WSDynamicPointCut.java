package com.ws.pc.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.ws.pc.beans.WeatherStation;

public class WSDynamicPointCut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class<?> cls, Object... args) {
		if ("getTemperature".equals(m.getName()) 
				&& cls == WeatherStation.class 
				&& args[0] instanceof Double) {
			return true;
		}
		return false;
	}
}
