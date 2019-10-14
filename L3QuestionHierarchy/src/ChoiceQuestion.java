import java.util.ArrayList;

public class ChoiceQuestion extends Question {

	private ArrayList<String> choices;

	public ChoiceQuestion(String question) {
		super(question, "");
		choices = new ArrayList<String>();
	}

	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			String choiceString = "" + choices.size();
			setSolution(choiceString);
		}
	}

	@Override
	public String getPrompt() {
		String prompt = "\n" + super.getPrompt();
		for (int i = 0; i < choices.size(); i++) {
			prompt += "\n  " + (i + 1) + ": " + choices.get(i);
		}
		return prompt;
	}
}
