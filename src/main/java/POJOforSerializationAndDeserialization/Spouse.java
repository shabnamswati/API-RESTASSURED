package POJOforSerializationAndDeserialization;

public class Spouse {
	String name;
	int [] phone;
	String company;
	
	
	
	public Spouse(String name, int[] phone, String company) {
		super();
		this.name = name;
		this.phone = phone;
		this.company = company;
	}
	



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getPhone() {
		return phone;
	}
	public void setPhone(int[] phone) {
		this.phone = phone;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	

}
