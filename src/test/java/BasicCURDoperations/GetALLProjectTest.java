package BasicCURDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetALLProjectTest {
	@Test
	public void getallprojectTest()
	{
	
//step1:create data

		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "swati");
		jobj.put("projectName", "TYSS");
		jobj.put("status", "created");
		jobj.put("teamsize", 10);
		
		//step2: send the request
		
		
		Response resp=RestAssured.get("http://localhost:8084/projects");
		//step3:validate reponse
		ValidatableResponse validate = resp.then();
		validate.log().all();
}}
