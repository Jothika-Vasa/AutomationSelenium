package Day16;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificAreaSC {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='30%'");
		
		WebElement GUIelements= driver.findElement(By.xpath("//div[@id='post-body-1307673142697428135']"));
		
		File Sourcefile= GUIelements.getScreenshotAs(OutputType.FILE);
		File TargetFile= new File(System.getProperty("user.dir")+"\\ScreenShots\\specificArea.png");
		Sourcefile.renameTo(TargetFile);
		
		
		

	}

}
