package basicCoreProgram;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the alphabet");
		char input = sc.next().charAt(0);
		if(input == 'a' || input == 'e' || input == 'i' || input == 'o'|| input == 'u')
			System.out.println(input+ " is Vowel");
		else
			System.out.println(input+" is Consonant");
	}
}
