package Day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	static void YearMonth(WebDriver driver,String month,String year){
	while(true) {
		String actualMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String actualYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(actualMonth.equals(month) && actualYear.equals(year)) {
			break;
		}
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next
		}
	}
	
	static void Date(WebDriver driver,String date) {
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
		for(WebElement daate:dates) {
			
			if(daate.getText().equals(date))
			{
				daate.click();
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//String year= "2023";
		//String month="March";
		//String date="21";
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		YearMonth(driver,"July","2027");
		Date(driver,"27");
		
		
	}

}
