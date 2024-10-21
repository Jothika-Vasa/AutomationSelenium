package Day5;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Naviandswitchmethod {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver= new ChromeDriver();
		
		//@SuppressWarnings("deprecation")
		//URL mylink = new URL("https://testautomationpractice.blogspot.com/");
	   // driver.navigate().to(mylink);
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		//driver.navigate().back();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		
		//driver.navigate().forward();
		//System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getTitle());
		//driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//List<WebElement> sent=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link' or @id='Wikipedia1_wikipedia-search-more'] "));
		//System.out.println("count:"+ sent.size());
		List<WebElement> sent=driver.findElements(By.partialLinkText("Selenium"));
		System.out.println("count:"+ sent.size());
		for (WebElement sents:sent) {
	        sents.click();
		}
		
		Set<String> winid= driver.getWindowHandles();
		//List<String> windid = new ArrayList(winid);
        /*for ( String windowids : windid) {
			
			System.out.println("Window Id :"+windowids );
			
		}*/
		
		for ( String windowids : winid) {
			
			String title = driver.switchTo().window(windowids).getTitle();
			System.out.println(title);
			if(title.equals("Selenium - Wikipedia") || title.equals("Selenium disulfide - Wikipedia"))
			{
				
				driver.close();	
			}
		}
				
		

	}

}
