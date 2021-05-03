package homework3;

public class StudentUser extends User {

	private String firstName;
	private String lastName;
	private String address;
	private String contactInformation;
	private String cardInformation;

	public StudentUser(String firstName, String lastName, String address, String contactInformation,
			String cardInformation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contactInformation = contactInformation;
		this.cardInformation = cardInformation;
	}

	public StudentUser() {

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public String getCardInformation() {
		return cardInformation;
	}

}
