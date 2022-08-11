package BasicCURDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	
	@Test
	public void updateprojectTest()
	{
		//step:1 create data

		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "swati");
		jobj.put("projectName", "TYSS1");
		jobj.put("status", "created");
		jobj.put("teamsize", 10);
		
		//step:2 send the request
		RequestSpecification req=RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response Request = req.put("http://localhost:8084/projects/TY_PROJ_1602");
		
		//step:3 validate response
		Request.then().log().all();
	}

}
