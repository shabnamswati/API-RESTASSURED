package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameter {
	@Test
	public void queryparameter() {
		
		baseURI="https://reqres.in";
		
		//create the pre-requisite
		given()
		.queryParam("page", 2)
		
		//send the request and validate the response
		.when()
		.get("/api/users")
		.then().log().all();
		
	}

}
