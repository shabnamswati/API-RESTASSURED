package BasicCURDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectWithBBD {
	@Test
	public void createprojectwithbdd()
	{
		//create random number
				Random r=new Random();
				int random =r.nextInt(500);
		baseURI="http://localhost";
		port=8084;
		
	
//step:1 create the data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "swati");
		jobj.put("projectName", "rmg"+random);
		jobj.put("status", "ongoing");
		jobj.put("teamsize", 10);
		//step:2 send the request
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()     //step:3 validate the response
		.assertThat().statusCode(201).log().all();
		 
}}
