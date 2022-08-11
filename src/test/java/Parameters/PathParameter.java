package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class PathParameter {
	@Test
	public void pathparameter()
	{
		//Random r=new Random();
		//int ran = r.nextInt(1000);
		baseURI="http://localhost:8084";
		//create tha data
		given()
		.pathParam("pid", "TY_PROJ_2002")
		//send the requst and validate response
		.when()
		.get("/projects/{pid}")
		.then().assertThat().statusCode(200).log().all();
	}

}
