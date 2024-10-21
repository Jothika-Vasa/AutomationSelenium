package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class Comm {

	public static void main(String[] args) {
		//Launch Browser 
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		//open URL
		driver.get("https://demo.nopCommerce.com");
		//Validate Title
		String act_title=driver.getTitle();
		if(act_title.equals("Just a moment...")) {
			System.out.println("Just a moment...is title");
				
		}
		else
		{
			System.out.println("title not matched");
		}
		driver.close();

	}

}
