package algorithmschallenges.easy;

import java.util.Scanner;

public class SolveMeFirstChallenge {
	
	public static void main (String [] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Por favor digite o primeiro numero");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			System.out.println(solveMeFirst(a, b));
				
		
	}
	
	static int solveMeFirst(int a, int b) {
		
		return a + b;
		
	}

}
