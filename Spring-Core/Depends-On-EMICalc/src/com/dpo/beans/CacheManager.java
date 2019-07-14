package com.dpo.beans;

import java.util.ResourceBundle;
import java.util.Set;

public class CacheManager {

	private Cache cache;

	public CacheManager(Cache cache) {
		this.cache  = cache;
		ResourceBundle bundle = ResourceBundle.getBundle("company_ri");
		Set<String> keys = bundle.keySet();
		if (!keys.isEmpty()) {
			for (String key : keys) {
				String val = bundle.getString(key);
				cache.put(key, Double.parseDouble(val));
			}
		}
	}

	@Override
	public String toString() {
		return "CacheManager [cache=" + cache + "]";
	}

}
