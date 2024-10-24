package Day11;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		 driver.get("https://demo.opencart.com/");
		 driver.manage().window().maximize();
		 
		 //Mouse Hover
		 
		 WebElement Components=  driver.findElement(By.xpath("//a[normalize-space()='Components']"));
		 
		 WebElement Monitor=driver.findElement(By.xpath("//a[normalize-space()='Monitors (2)']"));
		 
		 Actions act=new Actions(driver);
		 act.moveToElement(Components).moveToElement(Monitor).click().perform();
		 Thread.sleep(5000);
		
		 //right click
		 
		 driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		 driver.manage().window().maximize();
		 Actions act1=new Actions(driver);
		 WebElement rightbutton=driver.findElement(By.xpath("//span[text()='right click me']"));
		 
		 act1.contextClick(rightbutton).perform();
		 
		 driver.findElement(By.xpath("//span[text()='Paste']")).click();
		 Thread.sleep(5000);
		 Alert alt=driver.switchTo().alert();
		 System.out.println(alt.getText());
		 alt.accept();
		 
		 //drag drop
		 driver.get("https://demo.guru99.com/test/drag_drop.html");
		 
		 WebElement Bank=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		 WebElement Account1=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		 act.dragAndDrop(Bank, Account1).perform();
		 
		 WebElement five1=driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		 WebElement Amount1=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		 act.dragAndDrop(five1, Amount1).perform();
		 
		 WebElement sales=driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		 WebElement Account2=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		 
		 act.dragAndDrop(sales, Account2).perform();
		 
		 WebElement five2=driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		 WebElement amount2=driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		 
		 act.dragAndDrop(five2,amount2).perform();
		

	}

}
