package POJOforSerializationAndDeserialization;

public class PojoClassWithArrayObject {
	
	String eName;
	String eId;
	String address;
	
	String[] email;
	  Spouse  sp;
	
	public PojoClassWithArrayObject(String eName, String eId, String address, String[] email, Spouse sp) {
		
		this.eName = eName;
		this.eId = eId;
		this.address = address;
		this.email = email;
		this.sp = sp;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	public Spouse getSp() {
		return sp;
	}
	public void setSp(Spouse sp) {
		this.sp = sp;
	}
	
}

	
	
	
	


