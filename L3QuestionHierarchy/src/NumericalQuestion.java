
public class NumericalQuestion extends Question{
	private double tolerance;
	public NumericalQuestion(String question, double ans, double tol) {
		/*ASK ABOUT STORING DOUBLE ANSWER AS STRING IN THE SUPER CLASS*/
		super(question, "" + ans);
		tolerance = tol;
	}
	
	public boolean isCorrect(double test) {
		double a = Double.parseDouble(super.getSolution());
		return a < test + tolerance && a > test - tolerance;
	}

}
