package DifferentWayToPOST;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithJSONobject {
	@Test
	public void createprowithJSON()
	{
		baseURI="http://localhost";
		port=8084;
		//step:1 create the data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "swati");
		jobj.put("projectName", "tyss12");
		jobj.put("status", "created");
		jobj.put("teamSize", 10);
		
		//step:2 send the requset
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
	}

}
