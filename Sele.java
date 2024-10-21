package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Sele {
	public static void main(String arg[]) {
		//System.out.println("testing..");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		String opencarttitle=driver.getTitle();
		if(opencarttitle.equals("Your Store")) {
			System.out.println("Test passed");
		}
		else 
		{
			System.out.println("Test Failed");
		}
		//driver.close();
		driver.quit();
	}

}
