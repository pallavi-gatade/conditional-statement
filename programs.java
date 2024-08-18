# conditional-statement
conditional statement programs

package conditional.statement;

import java.util.Scanner;

//Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.
//1
//2 2
//3 3 3
//4 4 4 4  

public class Pyramid {
	public static void main(String[] args) {
		int i, j, n, s, x;
		System.out.print("Input number of rows : ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		s = n + 2 - 1;
		for (i = 1; i <= n; i++) {
			for (x = s; x != 0; x--) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
			s--;
		}
	}
}

//WAP Number of days in a months
package conditional.statement;

import java.util.Scanner;

public class NoDayInMonth {

	public static void main(String[] strings) {

		Scanner input = new Scanner(System.in);

		int number_Of_DaysInMonth = 0;
		String MonthOfName = "";

		System.out.print("Input a month number: ");
		int month = input.nextInt();

		System.out.print("Input a year: ");
		int year = input.nextInt();

		switch (month) {
		case 1:
			MonthOfName = "January";
			number_Of_DaysInMonth = 31;
			break;
		case 2:
			MonthOfName = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				number_Of_DaysInMonth = 29;
			} else {
				number_Of_DaysInMonth = 28;
			}
			break;
		case 3:
			MonthOfName = "March";
			number_Of_DaysInMonth = 31;
			break;
		case 4:
			MonthOfName = "April";
			number_Of_DaysInMonth = 30;
			break;
		case 5:
			MonthOfName = "May";
			number_Of_DaysInMonth = 31;
			break;
		case 6:
			MonthOfName = "June";
			number_Of_DaysInMonth = 30;
			break;
		case 7:
			MonthOfName = "July";
			number_Of_DaysInMonth = 31;
			break;
		case 8:
			MonthOfName = "August";
			number_Of_DaysInMonth = 31;
			break;
		case 9:
			MonthOfName = "September";
			number_Of_DaysInMonth = 30;
			break;
		case 10:
			MonthOfName = "October";
			number_Of_DaysInMonth = 31;
			break;
		case 11:
			MonthOfName = "November";
			number_Of_DaysInMonth = 30;
			break;
		case 12:
			MonthOfName = "December";
			number_Of_DaysInMonth = 31;
		}
		System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
	}
}

