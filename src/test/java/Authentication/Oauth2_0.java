package Authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class Oauth2_0 {
	@Test
	public void Oauth2_0()
	{
		baseURI="http://coop.apps.symfonycasts.com";
		
		//step:1 generate the access token
		
		  Response resp = given()
		.formParam("client_id", "SDET-36-REST@")
		.formParam("client_secret", "768ace487da9b5742529b883c4b0a7a4")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "http://shabnamswati.com")
		.formParam("code", "authorization_code")
		
		.when()
		.post("/token");//.then().log().all();
		  
		//step:2 capture the access token using json path
		  
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		//step:3 utilise the access token
		given()
		.auth()
		.oauth2(token)
		.pathParam("USER_ID",3673 )
		.when()
		
		//.post("/api/{USER_ID}/chickens-feed")
		//.post("/api/{USER_ID}/eggs-collect")
		.post("	/api/{USER_ID}/barn-unlock")
		.then().log().all();
	}

}
