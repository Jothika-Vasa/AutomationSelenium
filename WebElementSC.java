package Day16;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSC {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement title= driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		File Sourcefile= title.getScreenshotAs(OutputType.FILE);
		File Targetfile= new File(System.getProperty("user.dir")+"\\ScreenShots\\WeBElement.png");
		Sourcefile.renameTo(Targetfile);
		
		
		

	}

}
