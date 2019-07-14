package com.dpo.beans;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	private Map<String, Double> riMap = new HashMap<String, Double>();

	public void put(String key, Double val) {
		riMap.put(key, val);
	}

	public Double get(String key) {
		return riMap.get(key);
	}

	public boolean contains(String key) {
		return riMap.containsKey(key);
	}

	@Override
	public String toString() {
		return "Cache [riMap=" + riMap + "]";
	}

}
