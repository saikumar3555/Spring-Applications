package com.sp.apps;

public class EngineFactory {

	public static IEngine createEngine(int type) {
		if (type == 0) {
			return new Engine0();
		} else if (type == 1) {
			return new Engine1();
		}
		return null;
	}

}
