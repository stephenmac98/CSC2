public class TextbookQuestion {

	private String text;
	private String answer;
	
	public TextbookQuestion() {
		text = "";
		answer = "";
	}
	
	public TextbookQuestion(String question, String ans) {
		text = question;
		answer = ans;
	}
	
	public void setText(String questionText) {
		text = questionText;
	}
	
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}
	
	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}
	
	/*public void display() {
		System.out.println(text);
	}*/
	
	public String getText() {
		return text;
	}
}
