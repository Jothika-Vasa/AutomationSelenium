package Day12;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//keyboard actions
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Every thing will be fine");
		
		Actions act = new Actions(driver);
		
		//ctrl+A = select text
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//ctrl + C
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		//tab - changing to another tab in the same page
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Ctrl+v - paste the string
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		driver.findElement(By.xpath("//div[@class='compareButtonText']")).click();
		
		
		//Opening a page in the same tab by using Ctrl+click on the link 
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		WebElement linked=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[normalize-space()='Features']"));
		
		act.keyDown(Keys.CONTROL).click(linked).keyUp(Keys.CONTROL).perform();
		
		List <String> ids=new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		
		driver.switchTo().window(ids.get(0));
		driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		
		
		
		
		}
	
	
	}
