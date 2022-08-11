package GenericLibrary;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseApiClass {
	
	

	
	public DataBaseLibrary dLib=new DataBaseLibrary();
	public JavaLibrary jLib=new JavaLibrary();
	public RestAssuredLibrary rLib=new RestAssuredLibrary();
	
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		baseURI="http://localhost:8084";
		
		dLib.connectToDB();
		Reporter.log("===========connection successful=====",true);
		
		
		
	}
  @AfterSuite
  public void asConfig() throws SQLException
  {
	  dLib.closeDB();
	  Reporter.log("==========connection close=========",true);
  }
}
