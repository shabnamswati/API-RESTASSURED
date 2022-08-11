package RequestChaining;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Pojoclasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectAndUpdateProject {
	@Test
	public void createProjectAndUpdateProject() {
		
	   //random number
		Random r =new Random();
		int ran = r.nextInt(1000);
	
		 baseURI="http://localhost:8084";
    
    //step:1create the data
		 
    ProjectLibrary plib=new ProjectLibrary("swati", "tyss1"+ran, "created", 25);
    
  
     //step:2send the post request
    Response resp = given()
	        .body(plib)
             .contentType(ContentType.JSON)
             .when()
             .post("/addProject");
    resp.then().log().all();
    //step:3 capture projectid from the response body using jsonpath
    
   
   String proID = resp.jsonPath().get("projectId");
	System.out.println(proID);
	
    //update the project
    ProjectLibrary pLib=new ProjectLibrary("swati", "tyss12","completed", 25);
    
    Response resp1 = given()
	        .body(pLib)
             .contentType(ContentType.JSON)
             .when()
             .put("/projects/"+proID);
    resp1.then().log().all();
    
   
	
	
   
  //step:4 use the capture projectid in get request
	given()
	.pathParam("pid",proID)
	.when()
	.get("/projects/{pid}")
	.then()
	.assertThat().statusCode(200).log().all();
	
	//step:5 use the project ID in delete request
	
			given()
			.pathParam("pid", proID)
			.when()
			.delete("/projects/{pid}")
			.then()
			.assertThat().statusCode(204).log().all();
		}

}