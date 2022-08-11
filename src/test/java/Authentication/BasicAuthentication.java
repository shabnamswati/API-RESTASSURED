package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuthentication {
	@Test
	public void basicAuth()
	{
   baseURI="http://localhost";
   port=8084;
   //step:1 create pre requisites
   given()
   .auth()
   .basic("rmgyantra","rmgy@9999")
   
   //step:2 send the request and validate response
   .when()
   .get("/login")
   .then().assertThat().statusCode(202).log().all();
}
@Test
public void basicPreEmpltiveAuthTest() {
	 baseURI="http://localhost";
	   port=8084;
	   
	   given()
	   .auth()
	   .preemptive().basic("rmgyantra", "rmgy@9999")
	   .when()
	   .get("/login")
	   .then().log().all();
}
@Test
public void digestiveAuthTest()
{
	 baseURI="http://localhost";
	   port=8084;
	   
	   given()
	   .auth()
	   .digest("rmgyantra", "rmgy@9999")
	   .when()
	   .get("/login")
	   .then().log().all();
	   
}
	
}