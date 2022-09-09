package basicCoreProgram;

import java.util.Scanner;

public class SwapTwoNumbers {

public static void main(String[] args) {
		
		int FirstNumber, SecondNumber;
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the first number");
		FirstNumber = sc.nextInt();
		System.out.println("enter the second number");
		SecondNumber = sc.nextInt();
		FirstNumber = FirstNumber - SecondNumber;
		SecondNumber = FirstNumber + SecondNumber;
		FirstNumber = SecondNumber - FirstNumber;
		System.out.println("The first number is " +FirstNumber);
		System.out.println("The second number is " +SecondNumber);
}
}
