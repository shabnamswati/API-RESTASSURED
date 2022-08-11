package SerializationDeserialization;

import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.PojoClassWithArrayObject;
import POJOforSerializationAndDeserialization.Spouse;

public class SerializationForObject {
	@Test
	public void SerializationForObjectTest() {
		
		int phone[]= {7685,9786};
		Spouse sp=new Spouse("name","IMOU");
		
		String email[]= {"shabn@12gmail.com","swati2@gmail.com"};
		//Spouse sp=new Spouse(sp);
		
		PojoClassWithArrayObject e1=new PojoClassWithArrayObject("lala", "TY123", email, "bangalore","sp");

}}
