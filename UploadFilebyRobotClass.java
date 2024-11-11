package Day12;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFilebyRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 WebDriver driver= new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.foundit.in/upload");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//div[contains(text(),' Upload Resume')] ")).click();
		 //By SendKeys - Success
		// driver.findElement(By.xpath(" //input[@id='file-upload']")).sendKeys("C:\\Git Project\\text.txt");
		 
		 //By Robot Class
		// driver.findElement(By.xpath(" //input[@id='file-upload']")).click(); //It wont work 
		 // so we use Java Script Exception
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement file=driver.findElement(By.xpath(" //input[@id='file-upload']"));
		 js.executeScript("arguments[0].click();",file);
		 
		 //In Robot Class to upload we have to follow 3 steps are:
		 //1. copy file to clip board ctrl+c
		 StringSelection filepathSele= new StringSelection("C:\\Git Project\\text.txt");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepathSele,null);
		 
		 //2.Ctrl+V
		 Robot rb=new Robot();
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 rb.keyRelease(KeyEvent.VK_V);
		 
		 //3.click on return/enter key
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);	
		 Thread.sleep(3000);
		 
		 
		
	}

}
