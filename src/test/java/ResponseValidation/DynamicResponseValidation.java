package ResponseValidation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DynamicResponseValidation {
	@Test
	public void dynamicresval() {
    baseURI="http://localhost:8084";
    String expData="";
    //step:1 send the request
    //step:2 capture the response by writting json path
}
