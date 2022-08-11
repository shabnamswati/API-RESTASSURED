package DifferentWayToPOST;


import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import Pojoclasses.ProjectLibrary;
import io.restassured.http.ContentType;

public class CreatePOJO {
	@Test
	public void crepojo() {
	Random r=new Random();
	int ran = r.nextInt(1000);
	
	
		baseURI="http://localhost";
		port=8084;
		ProjectLibrary plib=new ProjectLibrary("swati", "tyss1234"+ran, "created", 12);
		given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
		

}}
