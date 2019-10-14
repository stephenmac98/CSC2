import java.util.Scanner;

public class TextbookQuestionDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("---------------TASK 1---------------");
		
		TextbookQuestion q = new TextbookQuestion();
		q.setText("Who was the inventor of Java?");
		q.setAnswer("James Gosling");
		
		/*q.display();
		System.out.print("Your Answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));
		in.close();*/
		
		TextbookQuestion q2 = new TextbookQuestion("Who was the inventor of Java?", "James Gosling");
		System.out.println(q2.getText());
		System.out.print("Your Answer: ");
		String response2 = in.nextLine();
		System.out.println(q.checkAnswer(response2));
		in.close();

	}

}
