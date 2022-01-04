package ÆÚÄ©;

public class User {
	private String username;
	private String passord;
	private int Score;

	public User(String username, String passord, int Score) {
		super();
		this.username = username;
		this.passord = passord;
		this.Score = Score;
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		this.Score = score;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassord() {
		return passord;
	}

	public void setPassord(String passord) {
		this.passord = passord;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		User other = (User) obj;
		if (passord == null) {
			if (other.passord != null)
				return false;
		} else if (!passord.equals(other.passord))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}
