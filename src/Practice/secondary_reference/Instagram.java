package Practice.secondary_reference;

public class Instagram {
	String instaUsername;
	String instaPassword;
	public String getInstaUsername() {
		return instaUsername;
	}
	public void setInstaUsername(String instaUsername) {
		this.instaUsername = instaUsername;
	}
	public String getInstaPassword() {
		return instaPassword;
	}
	public void setInstaPassword(String instaPassword) {
		this.instaPassword = instaPassword;
	}
	@Override
	public String toString() {
		return "Instagram [instaUsername=" + instaUsername + ", instaPassword=" + instaPassword + "]";
	}
	public Instagram(String instaUsername, String instaPassword) {
		super();
		this.instaUsername = instaUsername;
		this.instaPassword = instaPassword;
	}
	public Instagram() {
		super();
		// TODO Auto-generated constructor stub
	}

}
