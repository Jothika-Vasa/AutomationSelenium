package Day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsandauthentica {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		
		
		//normal alert
		/* driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		Thread.sleep(5000);
		Alert normal=driver.switchTo().alert();
		System.out.println(normal.getText());
		normal.accept(); */
		
		//Confirmation Alert
		/* driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Alert confirmation= driver.switchTo().alert();
		Thread.sleep(5000);
		//confirmation.accept();
		
		confirmation.dismiss();
		*/
		
		//Prompt Alert
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		Alert Prompt= driver.switchTo().alert();
		Prompt.sendKeys("Alert");
		Thread.sleep(5000);
		Prompt.dismiss();
		
		
		
	}

}
