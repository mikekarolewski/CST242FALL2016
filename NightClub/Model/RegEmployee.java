package Model;

public class RegEmployee extends Person {
	private String hireDate;
	private String fireDate;

	public RegEmployee(int id, String firstName, String lastName, String email, String username, int monthOfBirth,
			int dayOfBirth, int yearOfBirth, String hireDate, String fireDate) {
		
		super(id, firstName, lastName, email, username, monthOfBirth, dayOfBirth, yearOfBirth);
		this.hireDate = hireDate;
		this.fireDate = fireDate;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getFireDate() {
		return fireDate;
	}

	public void setFireDate(String fireDate) {
		this.fireDate = fireDate;
	}

}
