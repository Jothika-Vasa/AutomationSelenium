package Day17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveChromeCtrl {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://jqueryui.com/datepicker/");
		String act_title=driver.getTitle();
		if(act_title.equals("Just a moment...")) {
			System.out.println("Just a moment...is title");
				
		}
		else
		{
			System.out.println("title not matched");
		}
		
	}

}
