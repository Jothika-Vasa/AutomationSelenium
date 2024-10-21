package Day3;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WebDriverMeth {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//String title=driver.getTitle();
		//System.out.println(Driver.getTitle());
		//System.out.println(title);
		//String url=driver.getCurrentUrl();
		//System.out.println(url);
		//String psource=driver.getPageSource();
		//System.out.println(psource);
		//System.out.println(driver.getWindowHandle());
		//driver.findElement(By.xpath("//button[normalize-space()='New Tab']")).click();
		//Set<String> Window =driver.getWindowHandles();
		//System.out.println(Window);
		//Thread.sleep(5000);
		//driver.quit();
		//Boolean display=driver.findElement(By.xpath("//h2[text()='Dynamic Button']")).isDisplayed();
		//System.out.println(display);
		driver.findElement(By.xpath("//button[contains(@name='st')]")).click();
		//driver.findElement(By.xpath("//button[starts-with(@name='st')]")).click();
		//boolean status=driver.findElement(By.id("datepicker")).isEnabled();
		//System.out.println(status);
		driver.findElement(By.id("male")).click();
		boolean radio=driver.findElement(By.id("male")).isSelected();
		
		System.out.println(radio);

	}

}
