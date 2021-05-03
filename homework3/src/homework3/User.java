package homework3;

public class User {

	private int id;
	private String password;
	private String nickName;

	public User() {

	};

	public User(int id, String password, String nickName) {
		super();
		this.id = id;
		this.password = password;
		this.nickName = nickName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;

	}

}
