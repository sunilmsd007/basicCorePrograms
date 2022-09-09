package basicCoreProgram;

import java.util.Scanner;

public class PrimeFactors {

	static int count;
	public static void showPrimeFactor(int n) {
		int i,j;
		
		for(i=1; i<=n; i++) {
			if(n%i == 0) {
				count=0;
				for( j=2; j<=i/2; j++) {
					if(i%j == 0) {
						count=count+1;
					}
				}
				if(count==0) 
					System.out.println(i+ " ");
			}
			
		}
		
	}
	public static void main(String[] args) {
		
		int number;
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number");
		number = sc.nextInt();
		showPrimeFactor(number);
		
	}
}
