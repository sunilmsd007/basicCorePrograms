package basicCoreProgram;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the year");
		 year = sc.nextInt();
		  if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			System.out.println(year+ " year is leap year");
		else
			System.out.println(year+ " year is not a leap year");
}
}
