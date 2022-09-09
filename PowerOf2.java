package basicCoreProgram;

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {

		int number;
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number till you want to find power of 2");
		number = sc.nextInt();
		for(int i=0; i<=number; i++) {
		int pow = (int)Math.pow(2, i);
			System.out.println("2^"+i+ " is "+pow);
		}
	}
}
