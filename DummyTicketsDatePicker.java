package Day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DummyTicketsDatePicker {
	
	private static void DatePicker(WebDriver driver,String Year,String Month, String Date) {
	
			
			//year
			WebElement year= driver.findElement(By.xpath("//select[@aria-label='Select year']"));
			Select DateYear= new Select(year);
			
			DateYear.selectByVisibleText(Year);
			
			//month
			WebElement month=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
			Select DateMonth=new Select(month);
			
			DateMonth.selectByVisibleText(Month);
			
			//date 
			List<WebElement> dates= driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
			for(WebElement date:dates) {
				if(date.getText().equals(Date)) {
					date.click();
					break;
				}
			}
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		//ticket selection button
		driver.findElement(By.xpath("//input[@id='product_549']")).click();
		//first name 
		driver.findElement(By.xpath("//input[@id='travname']")).sendKeys("Enjoy");
		//last name
		driver.findElement(By.xpath("//input[@id='travlastname']")).sendKeys("the Trip");
		//DOB
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		String Date1="21";
		String Month1="Mar";
		String Year1="2001";
		
		DatePicker(driver,Year1,Month1,Date1);
		
		//Gender Selection 
		driver.findElement(By.xpath("//input[@id='sex_1']")).click();
		
		//travel type Selection 
		driver.findElement(By.xpath("//input[@id='traveltype_2']")).click();
		
		// from city 
		driver.findElement(By.xpath("//input[@id='fromcity']")).sendKeys("Hyderabad");
		
		//to city
		driver.findElement(By.xpath("//input[@id='tocity']")).sendKeys("Delhi");
		
		//Departure date
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		String Date2="29";
		String Month2="Apr";
		String Year2= "2025";
		
		DatePicker(driver,Year2,Month2,Date2);
		
		//Return Date
		driver.findElement(By.xpath("//input[@id='returndate']")).click();
		String Date3="19";
		String Month3="Aug";
		String Year3= "2025";
		
		DatePicker(driver,Year3,Month3,Date3);
		
		//purpose 
		driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
		driver.findElement(By.xpath("//li[text()='Prank a friend']")).click();
		
		/*
		//Appointment date 
		driver.findElement(By.xpath("//input[@id='appoinmentdate']")).click();
		String Date4="15";
		String Month4="May";
		String Year4= "2024";
		DatePicker(driver,Year4,Month4,Date4); */
		
		driver.findElement(By.xpath("//input[@id='deliverymethod_3']")).click();
		//phone
		driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("3456789012");
		//email
		driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("ddg@gmail.com");
		
		//Country - India
		driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		
		//zip
		driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("648374");
		//town
		driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Delhi");
		//Street Address
		driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("Plot A");
		
		//State
		driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click();
		driver.findElement(By.xpath("//li[text()='Maharashtra']")).click();
		
		//place order
		driver.findElement(By.xpath("//button[@id='place_order']")).click();
		
	}	
	
}
