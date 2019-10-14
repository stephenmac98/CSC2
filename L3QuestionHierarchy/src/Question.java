public class Question {

	private String text;
	private String answer;

	public Question(String prompt, String solution) {
		text = prompt;
		answer = solution;
	}

	public String getPrompt() {
		return text;
	}

	public String getSolution() {
		return answer;
	}
	
	public void setPrompt(String prompt) {
		text = prompt;
	}

	public void setSolution(String solution) {
		answer = solution;
	}

	public boolean isCorrect(String proposedSolution) {
		return proposedSolution.equals(answer);
	}
}