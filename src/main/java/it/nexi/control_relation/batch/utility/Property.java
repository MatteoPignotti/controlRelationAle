package it.nexi.control_relation.batch.utility;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

public final class Property {
	private static Property		instance;
	private static Properties	props	= new Properties();

	private Property() {
	}

	public static Property getInstance() {
		return (instance != null ? instance : new Property());
	}

	public static void initProperties(String filename) throws IOException {
		props.load(new FileInputStream(filename));
	}

	public static Properties getProperties() {
		return props;
	}

	public static String get(String key) {
		return props.getProperty(key);
	}
}
