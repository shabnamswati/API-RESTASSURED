package BasicCURDoperations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseApiClass;
import GenericLibrary.EndPointsLibrary;
import Pojoclasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.sql.SQLException;

public class CreateAndValidateDB extends BaseApiClass{
	@Test
	public void createAndValiDB() throws SQLException
	{
//step:1 create pre requisites
		ProjectLibrary pLib=new ProjectLibrary("swati", "rmg"+jLib.getRandomNum(),"created" ,12 );
				
		
		//step:2 send the data
		Response response = given()
		.body(pLib)
		.contentType(ContentType.JSON)
		.when()
		.post(EndPointsLibrary.createProject);
		response.then().log().all();
		
		
		//step:3 capture the projectID
		
		String expData = rLib.getJsonData(response, "projectId");
		Reporter.log(expData,true);
		
		
		//step:4 validate the id in database
		String query = "select*from project;";
		String actData = dLib.readDataFromDBAndValidate(query, 1, expData);
		Assert.assertEquals(expData, actData);
		
}}
