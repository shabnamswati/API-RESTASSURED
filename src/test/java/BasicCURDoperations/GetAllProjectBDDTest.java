package BasicCURDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class GetAllProjectBDDTest {
	@Test
	public void getallprojectbdd()
	{
		//create random number
				Random r=new Random();
				int random =r.nextInt(500);
		baseURI="http://localhost";
				port=8084;
	
//step:1 create tha data
				JSONObject jobj= new JSONObject();
				{
				  jobj.put("createdBy", "rmg");
				  jobj.put("createdOn","26/05/2021");
				  jobj.put("projectId","tys123");
				  jobj.put("projectName","rmgProject11"+random);
				  jobj.put("status","created");
				  jobj.put("teamSize", 10);
				
		//step:2 send the request and  validate the response
				  when()
				  .get("/projects")
				  .then()
				  .assertThat().statusCode(200).log().all();
		
				  
}}}
