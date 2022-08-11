package ResponseValidation;

import org.hamcrest.Matcher;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidationWithMatchers {
	@Test
	public void resptimevali() {
	baseURI="http://localhost";
	port=8084;
	//step:1 send the request and validate response
	when()
	.get("/projects")
	.then()
	.assertThat().time(Matchers.lessthan(8000L),TimeUnit.MILLISECONDS);
	
	
	}

}



