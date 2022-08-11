package BasicCURDoperations;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateTheProjectTest {
	@Test
	public void createproject()
	{
		//step:1 crete the nesseccery data
		JSONObject jobj= new JSONObject();
		{
		  jobj.put("createdBy", "rmg");
		  jobj.put("createdOn","26/05/2021");
		  jobj.put("projectId","tys123");
		  jobj.put("projectName","rmgProject11");
		  jobj.put("status","created");
		  jobj.put("teamSize", 10);
		}

		
		//step:2 send the request
		RequestSpecification request=RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);
		Response resp=request.post("http://localhost:8084/addProject");
		//step:3 validate the data
		System.out.println(resp.prettyPeek());
		
	}

}
