package com.training.mars;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		//user input for month
		System.out.println("Input month number: ");
		int month= scanner.nextInt();

		//user input for year
		System.out.println("Input year: ");
		int year= scanner.nextInt();

		calcDays(month, year);

	}

	private static void calcDays(int month, int year) {
		String monthName;
		int noDays = 0;
	
		switch (month) {
		case 1:  monthName = "January";
			noDays = 31;
			break;
		case 2:  monthName = "February";
			//check for leap year
			if (year%4 == 0) {
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
		System.out.println(monthName +" " + year + " has " + noDays + " days.");

	}
}