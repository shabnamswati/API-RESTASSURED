package ResponseValidation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

public class StaticResponseValidation {
	@Test
	public void staticresponsevali(){
		
	baseURI="http://localhost:8084";
	
	String expData="TY_PROJ_2017";
	
	//send the requst and validate the response
	
	Response res = when()
		.get("/projects");
	
	String actData=res.jsonPath().get("[1].projectId");
		System.out.println(actData);
		
		Assert.assertEquals(expData, actData);
		
	}

}
