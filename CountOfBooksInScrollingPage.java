package Day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CountOfBooksInScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver=new FirefoxDriver();
		    
		    driver.get("https://www.booksbykilo.in/new-books");
		    
		    driver.manage().window().maximize();
		    
		    JavascriptExecutor js= (JavascriptExecutor)driver;
		    
		    //Logic
		    
		    int CurrentCount=0;
		    int PreviousCount=0;
		    
		    while(true) {
		    	List<WebElement> books= driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
		    	CurrentCount=books.size();
		    	
		    	if(CurrentCount==PreviousCount) {
		    		break;
		    	}
		    	
		    	PreviousCount=CurrentCount;	
		    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    	Thread.sleep(5000);
		    	
		    }
		    
		    
		    System.out.println("Total Count of books:"+CurrentCount);
		    

	}

}
