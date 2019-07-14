package com.mc.util;

import java.util.HashMap;
import java.util.Map;

public class Monitor {

	private static Map<String, Integer> map = new HashMap<>();

	public static void increment(String methodName) {
		if (map.containsKey(methodName)) {
			map.put(methodName, getAccessCount(methodName) + 1);
		} else {
			map.put(methodName, 1);
		}
	}

	public static int getAccessCount(String methodName) {
		return map.get(methodName);
	}
}
