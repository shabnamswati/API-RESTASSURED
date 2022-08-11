package DifferentWayToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured .*;

import java.util.HashMap;
import java.util.Random;

public class CreateProjectWithHashmap {
	@Test
	public void createprohashmap()
	{
		
		Random r=new Random();
				int ran = r.nextInt(1000);
		baseURI="http://localhost";
		port=8084;
		//step1:create the data
		HashMap hm=new HashMap();
		hm.put("createdBy", "swati");
		hm.put("projectName", "tyss12"+ran);
		hm.put("sataus", "created");
		hm.put("teamSize", 12);
		//step:2 send the request
		given()
		.body(hm)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201).log().all();
	}

}
