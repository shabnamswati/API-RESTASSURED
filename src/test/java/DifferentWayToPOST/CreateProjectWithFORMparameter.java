package DifferentWayToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithFORMparameter {
	@Test
	public void createprojectwithformpara()
	{
	baseURI="http://localhost";
    port=8084;
    
    //step:1 create the data
    given()
    .formParam("cretedBy", "swati")
    .formParam("projectName", "tyss123")
    .formParam("status", "created")
    .formParam("teamSize", 12)
    .contentType(ContentType.JSON)

    .when()
    .post("/addProject")
    .then()
    .assertThat().statusCode(201).log().all();
}}
