package javachallenge.easy;

import java.util.Scanner;

public class SdintSdoutChallenge {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Por favor digite o primeiro numero");
	
		int number1 = scanner.nextInt();
		
		System.out.println("Por favor digite o segundo numero");
		
		int number2 = scanner.nextInt();
		
		System.out.println("Por favor digite o terceiro numero");
		
		int number3 = scanner.nextInt();
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);
	}

}
