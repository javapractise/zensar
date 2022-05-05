package com.java.java8feature.stream.stream1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDuration {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("Current Date -" + date);

		LocalDate date2 = date.plus(2, ChronoUnit.MONTHS);
		Period period = Period.between(date, date2);
		System.out.println("Period --" + period);

		LocalTime time1 = LocalTime.now();
		Duration threeHourse = Duration.ofHours(3);

		LocalTime time2 = time1.plus(threeHourse);
		Duration duration = Duration.between(time1, time2);

		System.out.println("Duration -- " + duration);

	}

}
