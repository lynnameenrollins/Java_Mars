package com.training.mars;

import javax.swing.Spring;

public class CalcDays {
		private int month;
		private int year;
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public CalcDays(int month, int year) {
		
			this.month = month;
			this.year = year;
		}
		
		public String getDaysInMonth() {
		String monthName;
		int noDays = 0;
	
		switch (month) {
		case 1:  monthName = "January";
			noDays = 31;
			break;
		case 2:  monthName = "February";
			//check for leap year
			if  (((year % 4 == 0) && 
                    !(year % 100 == 0))
                    || (year % 400 == 0)) {
				noDays = 29;
			}
			else {
				noDays = 28;
			}
			break;
		case 3:  monthName = "March";
			noDays = 31;
			break;
		case 4:  monthName = "April";
			noDays = 30;
			break;
		case 5:  monthName = "May";
			noDays = 31;
			break;
		case 6:  monthName = "June";
			noDays = 30;
			break;
		case 7:  monthName = "July";
			noDays = 31;
			break;
		case 8:  monthName = "August";
			noDays = 31;
			break;
		case 9:  monthName = "September";
			noDays = 30;
			break;
		case 10: monthName = "October";
			noDays = 31;
			break;
		case 11: monthName = "November";
			noDays = 30;
			break;
		case 12: monthName = "December";
			noDays = 31;
			break;
		default: monthName = "Invalid month";
		break;
		
		}
		return monthName +" " + year + " has " + noDays + " days.";
		}
}
