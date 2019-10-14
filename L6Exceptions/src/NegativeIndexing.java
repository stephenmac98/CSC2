import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NegativeIndexing {

	public static void main(String[] args) {
		System.out.println("Stephen Blackwell");
		System.out.println("N/A");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number of items, maximum value, and desired index: ");
		String input = keyboard.nextLine();
		keyboard.close();
				
		String[] data = input.split(" ");
		
		// Task 2.1 code here
		if(data.length != 3) {
			System.out.println("This input does not match our formating");
			System.exit(0) ;
		}
		
		try {
			int items = Integer.parseInt(data[0]);
			int max = Integer.parseInt(data[1]) + 1;
			int index = Integer.parseInt(data[2]);
			int[] values = rand(items, max);
			int value = get(values, index);
			System.out.print("[");
			for(int i = 0; i < values.length - 1; i++) {
				System.out.print(values[i] + ", ");
			}
			System.out.print(values[values.length - 1]);
			System.out.println("]");
			System.out.println("Value at Index: " + value);
		}
		catch(NumberFormatException ex) {
			System.out.println("At least one of the numbers in this input does not match our formating");
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("The index given is out of bounds");
		}
		
		
	}
	
	public static int[] rand(int amount, int cap) {
		if(cap < 1) {
			throw new IllegalArgumentException("The Cap is less than 1");
		}
		if(amount < 1) {
			throw new IllegalArgumentException("The Amount is less than 1");
		}
		int[] array = new int[amount];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(cap);
		}
		return array;
	}
	
	
	public static int get(int[] array, int index) {
		if (index < 0) {
			index = array.length + index;
		}
		return array[index];
	}

}
