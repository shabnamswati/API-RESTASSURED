package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameter {
	@Test
	public void formparameter() {
		//crete pre requist
		given()
		.formParam("createdBy", "swati")
		.formParam("projectName", "tyss123")
		.formParam("status", "created")
		.formParam("teamsize", 13)
		.contentType(ContentType.JSON)
		
		//send the request and validate the response
		.when()
		.post("http://localhost:8084/addProject")
		.then().log().all();
	}

}
