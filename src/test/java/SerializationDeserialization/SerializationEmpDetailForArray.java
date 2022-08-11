package SerializationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetails;
import POJOforSerializationAndDeserialization.PojoClassForArrayEmp;

public class SerializationEmpDetailForArray {
	@Test
	public void ArrayEmpDetails() throws JsonGenerationException, JsonMappingException, IOException {
		
		
		int phone[]= {7685,9786};
		String email[]= {"shab@123gmail.com","swati45@gmail.com"};
		//Step 1:create object of pojo and provide values.
		PojoClassForArrayEmp e1=new PojoClassForArrayEmp("swati", "TY123", phone, email, "bangalore");
		
		//Step 2: create object of object Mapper from jackson Mapper.
		ObjectMapper obj=new ObjectMapper();
		
		//Step3:write data into json file.
		obj.writeValue(new File("./shabnam.json"), e1);
	}
	
	

}
