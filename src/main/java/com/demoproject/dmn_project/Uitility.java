package com.demoproject.dmn_project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Uitility {

	public Uitility() {
	}

	public static int getNetWorkDays(String start_Date, String end_Date) {
		System.out.println("start_Date ::" + start_Date);
		int workDays = 0;

		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date startDate = format.parse(start_Date);
			Date endDate = format.parse(end_Date);
			Calendar startCal;
			Calendar endCal;
			startCal = Calendar.getInstance();
			startCal.setTime(startDate);
			endCal = Calendar.getInstance();
			endCal.setTime(endDate);
			// If working dates are same,then checking what is the day on that
			// date.
			if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
				if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
						&& startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
					++workDays;
				}
			}
			/*
			 * If start date is coming after end date, Then shuffling Dates and
			 * storing dates by incrementing upto end date in do-while part.
			 */
			if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
				startCal.setTime(endDate);
				endCal.setTime(startDate);
			}

			do {

				if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY
						&& startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
					++workDays;
				}
				startCal.add(Calendar.DAY_OF_MONTH, 1);
			} while (startCal.getTimeInMillis() <= endCal.getTimeInMillis());
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		return workDays;
	}

	public static boolean isHoliday(String inputDate) {
        System.out.println("isHoliday Date ::" + inputDate);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
				.ofPattern("yyyy-MM-dd");

		LocalDate date = LocalDate.parse(inputDate, dateTimeFormatter);
		DayOfWeek day = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));
		switch (day) {
			case SATURDAY :
				System.out.println("Weekend - Saturday");
				return true;
			case SUNDAY :
				System.out.println("Weekend - Sunday");
				return true;
			default :
				return false;
		}
	}
	
	public static boolean isHoliday1(java.lang.Object inputDate) {
        System.out.println("isHoliday1 ::" + inputDate);
        
        return true;
	} 
	
}