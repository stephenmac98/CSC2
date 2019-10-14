
public class LazyTyperQuestion extends Question{
	public LazyTyperQuestion(String Question, String Answer) {
		super(Question, Answer);
	}
	
	@Override
	public boolean isCorrect(String input) {
		String a = super.getSolution();
		return  a.toUpperCase().equals(input.toUpperCase());
	}
}
