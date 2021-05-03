package homework3;

public class InstructorUser extends User {

	private String firstName;
	private String lastName;
	private String autobiography;

	public InstructorUser(String firstName, String lastName, String autobiography) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.autobiography = autobiography;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAutobiography() {
		return autobiography;
	}

	public void setAutobiography(String autobiography) {
		this.autobiography = autobiography;
	}

}
