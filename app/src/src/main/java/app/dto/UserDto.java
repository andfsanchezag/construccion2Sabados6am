package app.dto;

public class UserDto {
	private long id;
	private PersonDto personId;
	private String password;
	private String userName;
	private String role;
	
	public UserDto() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PersonDto getPersonid() {
		return personId;
	}

	public void setPersonid(PersonDto personid) {
		this.personId = personid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
