public class Demo {

	public static void main(String[] args) {
		System.out.println("STEPHEN BLACKWELL");
		
		
		System.out.println("---------------TASK 2---------------");
		Question q = new Question("Who was the inventor of Java?", "James Gosling");
		test(q, "James Gosling");
		test(q, "james gosling");
		
		LazyTyperQuestion q2 = new LazyTyperQuestion("Who was the inventor of Java?", "James Gosling");
		LazyTyperQuestion q3 = new LazyTyperQuestion("Who was the inventor of Java?", "JaMeS GoSlInG");
		LazyTyperQuestion q4 = new LazyTyperQuestion("Who was the inventor of Java?", "james gosling");


		
		test(q2, "James Gosling");
		test(q2, "james gosling");
		test(q2, "JAMES GOSLING");
		test(q2, "JaMeS GoSlInG");
		test(q2, "WRONG ANSER");
		test(q2, "WrOnG aNsWeR");
		
		test(q3, "James Gosling");
		test(q3, "james gosling");
		test(q3, "JAMES GOSLING");
		test(q3, "JaMeS GoSlInG");
		test(q3, "WRONG ANSER");
		test(q3, "WrOnG aNsWeR");
		
		test(q4, "James Gosling");
		test(q4, "james gosling");
		test(q4, "JAMES GOSLING");
		test(q4, "JaMeS GoSlInG");
		test(q4, "WRONG ANSER");
		test(q4, "WrOnG aNsWeR");
		
		
		System.out.println("---------------TASK 3---------------");

		
		NumericalQuestion q5 = new NumericalQuestion("ANSWER IS 4.5", 4.5, .2);
		NumericalQuestion q6 = new NumericalQuestion("ANSWER IS 7.09", 7.09, .01);
		
		testNum(q5, 2.0);
		testNum(q5, 4.3);
		testNum(q5, 4.4);
		testNum(q5, 4.5);
		testNum(q5, 4.6);
		testNum(q5, 4.7);
		testNum(q5, 5.0);

		testNum(q6, 2.0);
		testNum(q6, 7.08);
		testNum(q6, 7.081);
		testNum(q6, 7.09);
		testNum(q6, 7.095);
		testNum(q6, 7.10);
		testNum(q6, 8.0);
		
		ChoiceQuestion q7 = new ChoiceQuestion("QUESTION");
		q7.addChoice("WRONG1", false);
		q7.addChoice("WRONG2", false);
		q7.addChoice("TRUE", true);


		ChoiceQuestion q8 = new ChoiceQuestion("QUESTION");
		q8.addChoice("WRONG1", false);
		q8.addChoice("TRUE", true);
		q8.addChoice("WRONG2", false);
		
		ChoiceQuestion q9 = new ChoiceQuestion("QUESTION");
		q9.addChoice("TRUE", true);
		q9.addChoice("WRONG1", false);
		q9.addChoice("WRONG2", false);
		
		test(q7, "1");
		test(q7, "2");
		test(q7, "3");
		
		test(q8, "1");
		test(q8, "2");
		test(q8, "3");
		
		test(q9, "1");
		test(q9, "2");
		test(q9, "3");
		
		
		System.out.println("---------------TASK 4---------------");

		
		
		ChoiceQuestion q10 = new ChoiceQuestion("QUESTION");
		q10.addChoice("TRUE", true);
		q10.addChoice("TRUE2", true);
		q10.addChoice("TRUE3", true);
		q10.addChoice("WRONG1", false);
		test(q10, "1");
		test(q10, "2");
		test(q10, "3");
		test(q10, "4");
		
		
		
		AllChoiceQuestion q11 = new AllChoiceQuestion("QUESTION");
		q11.addChoice("TRUE", true);
		q11.addChoice("TRUE2", true);
		q11.addChoice("WRONG1", false);
		AllChoiceQuestion q12 = new AllChoiceQuestion("QUESTION");
		q12.addChoice("WRONG1", false);
		q12.addChoice("TRUE", true);
		q12.addChoice("TRUE2", true);
		AllChoiceQuestion q13 = new AllChoiceQuestion("QUESTION");
		q13.addChoice("WRONG1", false);
		q13.addChoice("TRUE2", true);
		q13.addChoice("WRONG2", false);
		q13.addChoice("TRUE", true);
		q13.addChoice("TRUE2", true);
		
		test(q11, "12");
		test(q11, "123");
		test(q11, "1");
		
		test(q12, "23");
		test(q12, "13");
		test(q12, "2");
		
		test(q13, "245");
		test(q13, "2456");
		test(q13, "24");


		
	}
	

	public static void test(Question q, String possibleSolution) {
		System.out.println();
		System.out.println("          Prompt: " + q.getPrompt());
		System.out.println(" Stored Solution: " + q.getSolution());		
		System.out.println("Testing Solution: " + possibleSolution);
		System.out.println("         Correct? " + q.isCorrect(possibleSolution));
	}
	
	public static void testNum(NumericalQuestion b, Double posSol) {
		System.out.println();
		System.out.println("          Prompt: " + b.getPrompt());
		System.out.println(" Stored Solution: " + b.getSolution());		
		System.out.println("Testing Solution: " + posSol);
		System.out.println("         Correct? " + b.isCorrect(posSol));
	}
}
