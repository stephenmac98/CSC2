//Stephen Blackwell and Nina Crocco
public class Course {
	private String depName;
	private int number;
	private String secCode;
	private Term term;
	
	public String toString() {
		return "Course [dep=" + depName 
				+ ", num=" + number 
				+ ", sec=" + secCode 
				+ ",term= " + term
				+"]";
	}
	
	public Course(String depName, int num, String sec, int year, int seq) {
		this.depName = depName;
		this.number = num;
		this.secCode = sec;
		this.term = new Term(year, seq);
	}
	
	public String getDescription(boolean prependTerm) {
		if(prependTerm) {
			return term.getYear() +" " + term.getTerm() +" "+ depName + "*" + number + "*" + secCode;
		}
		return depName + "*" + number + "*" + secCode;
	}
	
	public boolean isExperimental() {
		String b = Integer.toString(number);
		return b.charAt(1) == '7';
	}
}
