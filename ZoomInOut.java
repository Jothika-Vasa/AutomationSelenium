package Day13;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZoomInOut {

	public static void main(String[] args) throws InterruptedException {
				WebDriver driver=new FirefoxDriver();
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("document.body.style.zoom='60%'");
				
				Thread.sleep(5000);
				
				js.executeScript("document.body.style.zoom='90'");
	}

}
