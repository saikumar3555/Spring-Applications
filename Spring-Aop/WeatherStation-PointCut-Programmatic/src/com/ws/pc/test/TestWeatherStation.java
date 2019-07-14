package com.ws.pc.test;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.ws.pc.aspects.LoggerAdvice;
import com.ws.pc.aspects.WSDynamicPointCut;
import com.ws.pc.aspects.WSStaticPointCut;
import com.ws.pc.beans.WeatherStation;

public class TestWeatherStation {

	public static void main(String[] args) {

		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new WeatherStation());

		// Advice class
		LoggerAdvice logger = new LoggerAdvice();

		// Static Pointcut class
		WSStaticPointCut wsp = new WSStaticPointCut();

		//Dynamic Pointcut
		WSDynamicPointCut wdp = new WSDynamicPointCut();

		// Adding pointcut and advice for Advisor
		
		// factory.addAdvisor(new DefaultPointcutAdvisor(wsp,logger));
		
		factory.addAdvisor(new DefaultPointcutAdvisor(wdp,logger));

		WeatherStation ws = (WeatherStation) factory.getProxy();
		ws.getTemperature(500081);
		//ws.willItReainToday(500082);
		//ws.willItReainTomorrow(500083);
	}

}
