package BasicCURDoperations;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjExixtingId {
	@Test
	public void createprojectexixtingid() {
	//create random number
		Random r=new Random();
		int random =r.nextInt(500);
	{
		//create the neccessery data
	
	JSONObject jobj=new JSONObject();
	{
		jobj.put("createdaBy", "rmg");
		jobj.put("projectName", "rmgproject1@+random");
		jobj.put("projectId", "rmg1@");
		jobj.put("status", "created");
		jobj.put("teamsize", 10);
	}
			
//send request data
	RequestSpecification request=RestAssured.given();
	request.body(jobj);
	request.contentType(ContentType.JSON);
	Response resp=request.post("http://localhost:8084/addProject");
//step:3 validate the data
	System.out.println(resp.prettyPrint());
}}}
