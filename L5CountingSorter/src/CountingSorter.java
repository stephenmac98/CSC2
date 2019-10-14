import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CountingSorter {

	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Stephen Blackwell");

		// Task 1: Ask for file name
		
		System.out.print("Please select a file: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		
		File fileName = new File(name);
		Scanner file = new Scanner(fileName);
		
		
		
		
		
		// Task 2: Determine the maximum value
		int max = 0;
		while(file.hasNextLine()){
			String line = file.nextLine();
			int test = Integer.valueOf(line);
			if(test > max) {
				max = test;
			}
		}
		System.out.println("Max: " + max);
		
		
		// Task 3: Count occurrences of each value between 0 and max
		
		for(int i = 0; i <= max; i++) {
			file = new Scanner(fileName);
			int count = 0;
			//System.out.println("Testing: " + i);
			while(file.hasNextLine()){
				String line = file.nextLine();
				if(Integer.valueOf(line) == i) {
					//System.out.println("HIT");
					count++;
				}
			}
			System.out.println(i + " - " + count);
		}
		
		
		// Task 4: Report results to an output file
		
		String outputFileName = "output-" + name;
		PrintWriter outFileWriter = new PrintWriter(outputFileName);
		for(int i = 0; i <= max; i++) {
			file = new Scanner(fileName);
			int count = 0;
			while(file.hasNextLine()){
				String line = file.nextLine();
				if(Integer.valueOf(line) == i) {
					count++;
				}
			}
			outFileWriter.println(i + " - " + count);
		}
		outFileWriter.close();

		
		//Task 4 Part 2
		String outputFileName2 = "output2-" + name;
		PrintWriter outFileWriter2 = new PrintWriter(outputFileName2);
		for(int i = 0; i <= max; i++) {
			file = new Scanner(fileName);
			while(file.hasNextLine()){
				String line = file.nextLine();
				if(Integer.valueOf(line) == i) {
					outFileWriter2.println(i);
				}
			}
		}
		outFileWriter2.close();
	}
	
}
