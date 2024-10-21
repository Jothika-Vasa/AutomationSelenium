package Day2;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Locators {
	public static void main(String args[]) {
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	//driver.findElement(By.name("search")).sendKeys("Iphone");
	//boolean logo=driver.findElement(By.id("nav-logo")).isDisplayed();
	
	//System.out.println(logo);
	//driver.findElement(By.linkText("Sell")).click();
	//driver.findElement(By.partialLinkText("MX ")).click();
	
	List <WebElement> links =driver.findElements(By.tagName("li"));
	//List <WebElement> links= driver.findElements(By.className("list-inline-item"));
	System.out.println("count of links:"+links.size());
	
	
	}

}
