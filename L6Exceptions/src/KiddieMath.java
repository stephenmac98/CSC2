import java.util.Random;
import java.util.Scanner;

public class KiddieMath {

	public static void main(String[] args) {
		System.out.println("Stephen Blackwell");
		System.out.println("N/A");

		// Create random two numbers between 0 and 9 
		Random rand = new Random();
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);

		// Calculate the sum
		int sum = x + y;

		// Prompt the user to solve x + y
		String prompt = x + " + " + y + " = ";
		System.out.print(prompt);
		
		// Store the response from the user
		Scanner in = new Scanner(System.in);		
		String response = in.nextLine();
		in.close();

		// Assess response and display appropriate message
		try {
			int respInt = Integer.valueOf(response);
			if(respInt == sum) {
				System.out.println("Yes! Very good!");
			}
			else {
				System.out.println("Sorry, that is not correct.");
				System.out.print(prompt + sum);
			}
		}
		catch (NumberFormatException ex){ 
			System.out.println("Try another problem, but use numerals for your answer.");
		}
		
		
	}

}
