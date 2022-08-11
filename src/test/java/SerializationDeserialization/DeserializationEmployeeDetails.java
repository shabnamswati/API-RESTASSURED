package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetails;

public class DeserializationEmployeeDetails {
	@Test
	public void deserilizationEmpDetailsTest() throws JsonParseException, JsonMappingException, IOException {
		
		//create object of object mapper from jackson mapper
	ObjectMapper obj=new ObjectMapper();
	
	//read the value from object mapper
	EmployeeDetails e1=obj.readValue(new File(".\\EmployeeDetails.json"),EmployeeDetails.class );
	
	//fetch the required value from class
	System.out.println(e1.getAddress());
	System.out.println(e1.geteId());
	System.out.println(e1.geteName());
	System.out.println(e1.getEmail());
	System.out.println(e1.getPhone());
}}
