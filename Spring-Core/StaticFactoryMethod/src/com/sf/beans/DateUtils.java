package com.sf.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	private Calendar calendar;

	public void getDate() {
		Date d = calendar.getTime();
		System.out.println(d);
	}

	public void getLastDay() {
		calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
		Date lastDayOfMonth = calendar.getTime();
		System.out.println(lastDayOfMonth);
	}

	public void getFirstDay() {
		calendar.set(Calendar.DATE, calendar.getActualMinimum(Calendar.DATE));
		Date firstDay = calendar.getTime();
		System.out.println(firstDay);
	}
	
	public void getNextMnthFirstDay() {
		calendar.set(Calendar.MONTH, 4);
		calendar.set(Calendar.DATE,calendar.getActualMinimum(Calendar.DATE));		
		Date firstDay = calendar.getTime();
		System.out.println(firstDay);
	}

	public void firstAndLastDatesFromGvnDt(String str,String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		calendar.setTime(date);
		System.out.println("First Day Of Month : " + calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println("Last Day of Month  : " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

}
