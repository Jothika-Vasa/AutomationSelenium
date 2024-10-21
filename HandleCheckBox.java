package Day6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Individual Select check box
		//driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		
		//select all check boxes
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//for(WebElement check:checkboxes) {
		//	check.click();
		//}
		
		//select last 4 options only
		for(int i=4;i<checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		//unselect all the selected boxes
		for(WebElement checkbox:checkboxes) {
			
			if(checkbox.isSelected()) {
				checkbox.click();
			}
		}

	}

}
