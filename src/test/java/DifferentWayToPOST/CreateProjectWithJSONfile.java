package DifferentWayToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectWithJSONfile {
	@Test
	public void createprojectwithjson() {
		
		baseURI="http://localhost";
		port=8084;
		
		
		//step:1 create the data
		File flib=new File(".\\src\\test\\resources\\RequestData.json");
		
		//step:2 send the data 
		given()
		.body(flib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()  //step:3 validate the response
	.assertThat().statusCode(201).log().all();
		
	}

}
