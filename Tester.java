//Stephen Blackwell and Nina Crocco
public class Tester {

	public static void main(String[] args) {
//		Term t = new Term();
//		System.out.println(t.toString());
		
		
		Term a = new Term(2018, 2);
		Term b = new Term(2019, 4);
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		Term c = new Term(2019, 4);
		System.out.println(c.toString());
		int year = c.getYear();
		String sequence = c.getTerm();
		System.out.println(year);
		System.out.println(sequence);
		c.setYear(2023);
		System.out.println(c.toString());
		c.setTerm(5);
		System.out.println(c.toString());
		year = c.getYear();
		sequence = c.getTerm();
		System.out.println(year);
		System.out.println(sequence);
		
		
		for(int i = 1; i <= 5; i++) {
			Term d = new Term(2019, i);
			System.out.println(d.getTerm(true));
			System.out.println(d.getTerm(false));

		}
		
		
//		Course e = new Course();
//		System.out.println(e.toString());
		
		Course f = new Course("CSC", 230, "DH", 2012, 1);
		System.out.println(f.toString());
		
		System.out.println(f.getDescription(true));
		System.out.println(f.getDescription(false));
		
		Course g = new Course("CSC", 270, "DH", 2012, 1);
		Course h = new Course("CSC", 280, "DH", 2012, 1);
		Course i = new Course("CSC", 370, "DH", 2012, 1);
		System.out.println(f.isExperimental() + " Expect FALSE");
		System.out.println(g.isExperimental() + " Expect TRUE");
		System.out.println(h.isExperimental() + " Expect FALSE");
		System.out.println(i.isExperimental() + " Expect TRUE");

		
	}
	
	
}
