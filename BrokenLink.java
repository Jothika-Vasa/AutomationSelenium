package Day18;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args)  {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		System.out.println("Total Links:"+links.size());
		int countofBroken=0;
		
		for(WebElement link:links) {
			
			String hrefvalue=link.getAttribute("href");
			
			if(hrefvalue == null || hrefvalue.isEmpty()) {
				System.out.println("Href is null or empty");
				continue;
			}
			try {
			
			URL LinkUrl = new URL(hrefvalue);
			HttpURLConnection conn= (HttpURLConnection) LinkUrl.openConnection();
			conn.connect();
						
			if(conn.getResponseCode()>=400) {
				System.out.println(hrefvalue+"Broken Link");
				countofBroken++;
			}
			else {
				System.out.println(hrefvalue+"not Broken Link");
			}
			}
			catch (Exception e) {
				
			}
		}
		System.out.println(countofBroken+"Broken Links Count");

	}

}
