package Authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class BearerToken {
	@Test
	public void bearerToken() {
		//step:1 create pre requisites
		HashMap map=new HashMap();
		map.put("name", "sdet-36");
		map.put("description", "api framwork");
		given()
		.auth()
		.oauth2("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")
		.body(map)
		.contentType(ContentType.JSON)
			
		//step:2 send the request and validate
		.when()
		.post("https://api.github.com/user/repos")
		.then().log().all();
	}

}
