package GenericLibrary;

import java.util.Random;

/**
 * this class contains all java specific generic methods
 * @author SHABNAM SWATI
 * 
 * 
 */

public class JavaLibrary {
	/**
	 * this method will generate random number for every execution
	 * @return
	 * 
	 * 
	 */
	public int getRandomNum()
	{
		Random r =new Random();
		 return r.nextInt(1000);
	}
}
