package Day20;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Config.properties");
			Properties prop = new Properties();
			prop.load(file);
			
			//read Data from property file 
			String URL=prop.getProperty("appurl");
			String Email=prop.getProperty("email");
			String Psw=prop.getProperty("password");
			String Login=prop.getProperty("login");
			String Logout=prop.getProperty("logout");
			
			System.out.println(URL+" "+Email+" "+Psw+" "+Login+" "+Logout);
			
			//Read Keys 
			Set<Object> keys= prop.keySet();
			System.out.println(keys);
			
			//read values from file
			Collection<Object> values=prop.values();
			System.out.println(values);
			
			file.close();
			

	}

}
