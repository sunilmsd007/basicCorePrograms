package basicCoreProgram;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		int number;
	    double result = 0.0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number");
		number = sc.nextInt();
		for(int i=1; i<=number; i++) {
			if(i==number)
				System.out.println("1/"+i);
			else
			System.out.print("1/"+i+ " + ");
	    result = result + (double) 1 / i;
		}
	    System.out.println("Value of Harmonic Series is "+result);
	}
}
