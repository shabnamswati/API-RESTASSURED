package GenericLibrary;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * this class contains rest assured specific re useable methods
 * @author SHABNAM SWATI
 * 
 */
public class RestAssuredLibrary {
	
/**
 * this method will get the json data through json path from response body 
 * @param RestAssured 
 * @param response 
 * @param path 
 * @param path 
 * 
 */
	public String getJsonData(Response response, String path)
	{
		String jsonData=response.jsonPath().get(path);
		return jsonData;
	}
}
