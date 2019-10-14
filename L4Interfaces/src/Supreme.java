import java.time.LocalDate;

public class Supreme implements Comparable<Supreme>{

	private String fullName;
	private String appointedBy;
	private int birthYear;
	private LocalDate started;

	public Supreme(String fullName, String appointedBy, int birthYear, String started) {
		this.fullName = fullName;
		this.appointedBy = appointedBy;
		this.birthYear = birthYear;
		this.started = LocalDate.parse(started);
	}
	
	
	@Override
	public int compareTo(Supreme s){
		return this.started.compareTo(s.started);
	}

	public String getFullName() {
		return fullName;
	}

	public String getAppointedBy() {
		return appointedBy;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public LocalDate getStarted() {
		return started;
	}
	
	public String toString() {
		String fmt = "%-20s  %-20s  %d  %s";
		return String.format(fmt, fullName, appointedBy, birthYear, started);
	}
	
}
