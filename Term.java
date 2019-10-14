//Stephen Blackwell and Nina Crocco
public class Term {
	private int year;
	private int term;
	
	public String toString() {
		return "Term[year=" + year + ", seq=" + term + "]";
	}
	
	public Term(int year, int term) {
		this.year = year;
		this.term = term;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public int getYear() {
		return year;
	}

	public String getTerm() {
		return getNumDescription();
	}
	
	private String getNumDescription() {
		String[] descriptions = {"Unknown", "Fall", "Winter", "Spring", "Summer 1", "Summer 2"};
		if (term >= 1 && term < descriptions.length) {
			return descriptions[term];
		}
		return descriptions[0];
	}
	
	public String getTerm(boolean academic) {
		if(academic) {
			if(this.term == 1) {
				return this.getNumDescription() + " of AY " 
						+ year + "-" + String.valueOf(year + 1);
			}
			else if(this.term == 2 || this.term == 3) {
				return this.getNumDescription() + " of AY " 
						+ String.valueOf(year - 1) + "-" + year;
			}
		}
		return this.getNumDescription() + " " + year;
	}
	
	
	
	
}
