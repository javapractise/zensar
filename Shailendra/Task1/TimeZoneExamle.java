package com.java.java8feature.stream.stream1;

import java.time.ZonedDateTime;
import java.util.TimeZone;

public class TimeZoneExamle {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getDefault();
String timezone = ZonedDateTime.now(timeZone.toZoneId()).getOffset().getId();
System.out.println(timezone);
	}

}
