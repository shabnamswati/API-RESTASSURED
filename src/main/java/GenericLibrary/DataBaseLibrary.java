package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseLibrary {
	Driver driverRef;
	Connection con;
	/**
	 * this method will establish the connection with mysql db 
	 * @throws SQLException 
	 * 
	 * 
	 * 
	 */

public void connectToDB() throws SQLException {
	driverRef = new Driver();
	DriverManager.registerDriver(driverRef);
	con=DriverManager.getConnection(IConstant.dbURL,IConstant.dbUserName,IConstant.dbPassword);
}
/**
 * this method will close db connection
 * @throws SQLException 
 * 
 * 
 * 
 */
public void closeDB() throws SQLException
{
	con.close();
}

public String readDataFromDBAndValidate(String query, int columnIndex, String expData) throws SQLException
{
	boolean flag=false;
 ResultSet result=con.createStatement().executeQuery(query);
 while(result.next())
	 {
	 	if(result.getString(columnIndex).equalsIgnoreCase(expData))
{
	flag=true;
	break;
}
	 }
if(flag)
{
	System.out.println("data verify");
	return expData;
}
else
{
	System.out.println("data not verify");
	return"";
}
}
}
