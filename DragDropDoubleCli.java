package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDoubleCli {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		//Automation Practice page
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Mouse Hover
		
		WebElement pm= driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		WebElement mobile= driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(pm).moveToElement(mobile).perform();
		Thread.sleep(5000);
		//Double Click
		WebElement f1= driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement f2= driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement copytext= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		f1.clear();
		f1.sendKeys("Hi Joo");
		act.doubleClick(copytext).perform();
		
		if(f2.getAttribute("value").equals("Hi Joo")) {
			
			System.out.println("Same.. bro");
			
		}
		else 
		{
			System.out.println("not same dude");
		}
		
		//drag and drop
		WebElement source=driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(source, target).perform();
		System.out.println(driver.findElement(By.xpath("//p[normalize-space()='Dropped!']")).getText());

	}
}
