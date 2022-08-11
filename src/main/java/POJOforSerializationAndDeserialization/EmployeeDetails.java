package POJOforSerializationAndDeserialization;

public class EmployeeDetails {
	//step 1:decare all the veriables as global
	String eName;
	String eId;
	int phone;
	String email;
	String address;
	

	//step2:use constructor to initilize
	public EmployeeDetails(String eName, String eId, int phone, String email, String address) {
		
		this.eName = eName;
		this.eId = eId;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	//create constructor for deserialization
	public EmployeeDetails ()
	{
	}
	
	
	
	
		//use getter and setter to access


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


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	}

