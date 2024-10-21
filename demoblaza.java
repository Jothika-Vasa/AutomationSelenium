package Day2;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class demoblaza {
  public static void main(String args[]) {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.demoblaze.com/index.html");
	  driver.manage().window().maximize();
	  //List <WebElement> links=driver.findElements(By.className("nav-item"));
	  //System.out.println("count of links :"+links.size());
	 // List <WebElement> image=driver.findElements(By.tagName("img"));
	 // System.out.println("count of images :"+image.size());
	  
	  driver.findElement(By.linkText("Cart")).click();
	  
	  
  }
}
