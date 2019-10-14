import java.util.ArrayList;
import java.util.Comparator;

public class Tester {

	public static void main(String[] args) {
		System.out.println("STEPHEN BLACKWELL");
		System.out.println("PARTNER FULL NAME HERE");

		ArrayList<Supreme> justices = new ArrayList<Supreme>();

		// Data from Wikipedia:
		// https://en.wikipedia.org/wiki/List_of_Justices_of_the_Supreme_Court_of_the_United_States
		justices.add(new Supreme("Brett Kavanaugh", "Donald Trump", 1965, "2018-10-06"));
		justices.add(new Supreme("Clarence Thomas", "George H. W. Bush", 1948, "1991-10-15"));
		justices.add(new Supreme("Elena Kagan", "Barack Obama", 1960, "2010-08-05"));
		justices.add(new Supreme("Neil Gorsuch", "Donald Trump", 1967, "2017-04-10"));
		justices.add(new Supreme("John Roberts", "George W. Bush", 1955, "2005-09-29"));
		justices.add(new Supreme("Ruth Bader Ginsburg", "Bill Clinton", 1933, "1993-08-10"));
		justices.add(new Supreme("Samuel Alito", "George W. Bush", 1950, "2006-01-31"));
		justices.add(new Supreme("Sonia Sotomayor", "Barack Obama", 1954, "2009-08-06"));
		justices.add(new Supreme("Stephen Breyer", "Bill Clinton", 1938, "1994-08-03"));

		print("original ordering by full name", justices);

		
		justices.sort(null);
		print("default sort by tenure", justices);

		// Task 1, Second subtask code below here
		class JusticeSorter implements Comparator<Supreme>{
			@Override
			public int compare(Supreme s1, Supreme s2) {
				int year1 = s1.getBirthYear();
				int year2 = s2.getBirthYear();
				return year2-year1;
			}
		}
		Comparator j = new JusticeSorter();
		justices.sort(j);
		

		print("special sort by birth year", justices);

	}

	public static void print(String message, ArrayList list) {
		System.out.println();
		System.out.println("List: " + message);
		System.out.println("------------------------------------------------------------");
		for (Object obj: list) {
			System.out.println(obj);
		}
	}

}
