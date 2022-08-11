package DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pojoclasses.ProjectLibrary;

public class CreateMultipleProjects {
	@Test(dataProvider = "getData")
	public void createProject(String createdBy, String projectName, String status, int teamSize)
	{
		
		//Prerequisties
		//ProjectLibrary jLib = new ProjectLibrary(createdBy, projectName, status, teamSize);
		ProjectLibrary pLib = new ProjectLibrary(createdBy, projectName+jLib.getRandomNumber(), status, teamSize);
		baseuri= "http://localhost";
		port = 8084;
		
		
		given()
		 .body(pLib)
		 .contentType(ContentType.JSON)
	   
		//Actions
		.when()
		 .post("/addProject")
		 
		//Validation
		.then().log().all();
		
		
	}
	
	
	@DataProvider(name = "getData")
	public Object[][] data()
	{
		Object[][] data = new Object[3][4];
		
		data[0][0] = "Chaitra";
		data[0][1] = "Dell";
		data[0][2] = "Completed";
		data[0][3] = 12;
		
		data[1][0] = "Vijay";
		data[1][1] = "HP";
		data[1][2] = "Created";
		data[1][3] = 15;
		
		data[2][0] = "Pavan";
		data[2][1] = "TYSS";
		data[2][2] = "On Going";
		data[2][3] = 20;
		
		
		return data;
	}

}
