package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.PojoClassForArrayEmp;

public class DeserializationEmpDetailForArray {
	@Test
	public void DeserializationEmpDetailForArray() throws JsonParseException, JsonMappingException, IOException
	{
		//create object of object mapper from jackson mapper
		ObjectMapper obj=new ObjectMapper();
		
		//read the value from object mapper
		
		PojoClassForArrayEmp pc=obj.readValue(new File(".\\shabnam.json"),PojoClassForArrayEmp.class );
		
		//fetch the required value from class
		System.out.println(pc.getAddress());
		System.out.println(pc.geteId());
		System.out.println(pc.geteName());
		
	}
	
	


}
