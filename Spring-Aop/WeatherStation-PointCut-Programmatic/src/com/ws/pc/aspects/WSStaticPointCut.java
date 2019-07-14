package com.ws.pc.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.support.NameMatchMethodPointcut;

import com.ws.pc.beans.WeatherStation;

public class WSStaticPointCut extends NameMatchMethodPointcut {

	private static final long serialVersionUID = -702000262578084944L;

	@Override
	public boolean matches(Method m, Class<?> cls) {

		if (m.getName().equals("getTemperature") && cls == WeatherStation.class) {
			return true;
		}

		return false;
	}

}
