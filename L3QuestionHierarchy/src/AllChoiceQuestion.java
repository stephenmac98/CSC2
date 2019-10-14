import java.util.ArrayList;

public class AllChoiceQuestion extends ChoiceQuestion{
	
	private ArrayList<String> choices;
	private String choiceString = "";


	public AllChoiceQuestion(String Question) {
		super(Question);
		choices = new ArrayList<String>();
	}
	
	@Override
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			choiceString = choiceString + choices.size();
			setSolution(choiceString);
		}
	}
}
