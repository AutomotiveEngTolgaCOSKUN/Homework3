package homework3;

public class Main {

	public static void main(String[] args) {

		User user = new User();
		user.setId(1);
		user.setNickName(" Kullanýcý Adýný Giriniz");

		InstructorUser instructorUser = new InstructorUser("Engin", "Demiroð", "A Successful Past");
		instructorUser.setId(2);
		instructorUser.setFirstName("Engin");
		instructorUser.setLastName("Demiroð");
		instructorUser.setNickName("Best Teacher");
		instructorUser.setAutobiography("A Successful Past");

		StudentUser studentUser = new StudentUser();
		studentUser.setId(3);
		studentUser.setFirstName("Tolga");
		studentUser.setLastName("ÇOÞKUN");
		studentUser.setContactInformation("Phone Number = 0500 100 20 30");
		studentUser.setAddress("Bayraklý / Ýzmir");
		studentUser.setNickName("Automotive Eng.");

		UserManager userManager = new UserManager();
		userManager.enterSystem(user);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomework(instructorUser);
		StudentManager studentManager = new StudentManager();
		studentManager.doHomework(studentUser);

	}
}
