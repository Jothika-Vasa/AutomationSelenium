package Day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Select Drop Down
		//driver.navigate().to("https://testautomationpractice.blogspot.com");
		
		
		/* WebElement countrydropdown= driver.findElement(By.xpath("//select[@id='country']"));
		Select country=new Select(countrydropdown);
		
		//country.selectByVisibleText("Japan");
		//country.selectByValue("australia");
		//country.selectByIndex(4);
		
		List<WebElement> options= country.getOptions();
		System.out.println(options.size());
		for(WebElement option:options) {
			System.out.println(option.getText());
		}*/
		
		/*WebElement Colors = driver.findElement(By.xpath("//select[@id='colors']"));
		Select colors=new Select(Colors);
		
		colors.selectByVisibleText("Green");
		*/
		
		//BootStrap DropDown
		/*driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multi')]")).click();
		//driver.findElement(By.xpath("//input[@value='MySQL']")).click();
		List<WebElement> options= driver.findElements(By.xpath("//ul[contains(@class,'multi')]//label"));
		for(WebElement option:options) {
			//System.out.println(options.getText());
			//option.getText();
			if(option.getText().equals("MySQL")||option.getText().equals("Python")||option.getText().equals("CSS")) {
				option.click();
			}
		} */
		
		//Hidden Drop Down
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		
		driver.findElement(By.xpath("//div[@class='oxd-table-filter']//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]")).click();
		driver.findElement(By.xpath("//span[text()='Full-Time Permanent']")).click();
	}

}
