package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetails;


public class SerializationEmployeeDetails {
	
	@Test
	public void serializeEmpDetailsTest() throws JsonGenerationException, JsonMappingException, IOException
	{
	//Step 1:create object of pojo and provide values.
	EmployeeDetails emp=new EmployeeDetails("shabnam", "TY123", 7479, "shabnamswati11@gmail.com", "bangalore");
	
	//Step 2: create object of object Mapper from jackson Mapper.
	ObjectMapper obj=new ObjectMapper();
	
	//Step3:write data into json file.

	obj.writeValue(new File("./EmployeeDetails.json"), emp);
	

}}
