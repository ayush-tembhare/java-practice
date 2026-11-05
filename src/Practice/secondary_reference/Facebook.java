package Practice.secondary_reference;

public class Facebook {
	String fbusername;
	String fbpassword;
	public Facebook(String fbusername, String fbpassword) {
		super();
		this.fbusername = fbusername;
		this.fbpassword = fbpassword;
	}
	public Facebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Facebook [fbusername=" + fbusername + ", fbpassword=" + fbpassword + "]";
	}
	public String getFbusername() {
		return fbusername;
	}
	public void setFbusername(String fbusername) {
		this.fbusername = fbusername;
	}
	public String getFbpassword() {
		return fbpassword;
	}
	public void setFbpassword(String fbpassword) {
		this.fbpassword = fbpassword;
	}
}
