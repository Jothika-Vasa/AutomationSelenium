package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaScrExecuclickandsendkeys {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//sendKeys 
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Jothika')", name);
		
		//click
		
		WebElement radioclick=driver.findElement(By.xpath("//input[@id='thursday']"));
		
		js.executeScript("arguments[0].click()", radioclick);
		

	}

}
