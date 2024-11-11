package Day12;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabandWindow {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//opencart will open first and then orangehrm will open on the same window, so we can only see 
		//one tab is orangehrm page becz opencart is closed 
		
		driver.get("https://www.opencart.com/");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//This open 2 links in same window but different tabs
		
        driver.get("https://www.opencart.com/");
        driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//This open 2 links in two different windows
		
		driver.get("https://www.opencart.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		List <String> ids=new ArrayList(driver.getWindowHandles());
		System.out.println(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(0));
		
		driver.close();
	}

}
