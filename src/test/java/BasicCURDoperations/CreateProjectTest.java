package BasicCURDoperations;



import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
@Test
public void createProjectTest() {
	
	//create random number
	Random r=new Random();
	int random =r.nextInt(500);
	
	//step:1 create the necessery data
	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy", "swati");
	jobj.put("projectName", "TYSS"+random);
	jobj.put("status", "created");
	jobj.put("teamsize", 10);
	
	
	//step:2 send the request
	RequestSpecification request = RestAssured.given();
	request.body(jobj);
	request.contentType(ContentType.JSON);
	
	Response resp=request.post("http://localhost:8084/addProject");
	
	//step:3 validate the data
	
	System.out.println(resp.prettyPeek());
	//ValidatableResponse validate=resp.then();
	//validate.log().all();
	
}
}
