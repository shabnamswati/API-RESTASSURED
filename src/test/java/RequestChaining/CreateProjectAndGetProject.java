package RequestChaining;

import org.testng.annotations.Test;

import Pojoclasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectAndGetProject {
	@Test
	public void createprogetpro() {
		Random r=new Random();
		int ran = r.nextInt(1000);
		baseURI="http://localhost";
		port=8084;
		
		//step:1 create the data
		
		ProjectLibrary plib=new ProjectLibrary("swati", "tyss"+ran, "created", 12);
		
		//step:2 send the post request
		
		Response resp = given()
				        .body(plib)
		                 .contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		
		//step:3 capture projectid from the response body using jsonpath
		
		
		String proID = resp.jsonPath().get("projectId");
		System.out.println(proID);
		
		//step:4 use the capture projectid in get request
		
		//when()
		//.get("/projects/"+proID)
		//.then().log().all();
		
		given()
		.pathParam("pid",proID)
		.when()
		.get("/projects/{pid}")
		.then()
		.assertThat().statusCode(200).log().all();
		
		//step:5 use the project ID in delete request
		
		given()
		.pathParam("pid", proID)
		.when()
		.delete("/projects/{pid}")
		.then()
		.assertThat().statusCode(204).log().all();
	}

}
