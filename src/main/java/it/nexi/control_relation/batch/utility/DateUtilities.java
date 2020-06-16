package it.nexi.control_relation.batch.utility;

import java.sql.Timestamp;

public class DateUtilities {
	private DateUtilities() {
	}

	public static Timestamp now() {
		return new Timestamp(System.currentTimeMillis());
	}
}
