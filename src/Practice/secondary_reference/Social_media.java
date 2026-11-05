package Practice.secondary_reference;

public class Social_media {
	Facebook facecook;
	Instagram instagram;
	
 public Social_media() {
		super();
		// TODO Auto-generated constructor stub
	}

 public Social_media(Facebook facecook, Instagram instagram) {
		super();
		this.facecook = facecook;
		this.instagram = instagram;
	}

 @Override
	public String toString() {
		return "Social_media [facecook=" + facecook + ", instagram=" + instagram + "]";
	}

 public Facebook getFacecook() {
		return facecook;
	}

	public void setFacecook(Facebook facecook) {
		this.facecook = facecook;
	}

	public Instagram getInstagram() {
		return instagram;
	}

	public void setInstagram(Instagram instagram) {
		this.instagram = instagram;
	}


}
