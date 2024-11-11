package Day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FindbookinScrollingPage {

	public static void main(String[] args) {
	    WebDriver driver=new FirefoxDriver();
	    
	    driver.get("https://www.booksbykilo.in/new-books");
	    
	    driver.manage().window().maximize();
	    
	    Actions act = new Actions(driver);
	    /*
	    //By Actions -- Failed 
	    WebElement book= driver.findElement(By.xpath("//h3[normalize-space()='The Wisdom of Morrie']"));
	    //act.scrollToElement(book).perform();
	    
	    // By JavaScript Executor --failed
	    JavascriptExecutor js= (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();", book);
	   */
	    
	    //By Logic 
	    boolean found = false;
	    
	    while(!found) {
	    	
	    	 List<WebElement> books= driver.findElements(By.xpath("//div[@id='productsDiv']//h3"));
	    	 for(WebElement book:books) {
	    		 
	    		 if(book.getText().equals("The Wisdom of Morrie")) {
	    			 System.out.println("Book Found");
	    			 found=true;
	    			 break;
	    		 }
	    		 }
	    	 act.sendKeys(Keys.END).perform();
	    	 }
	    	driver.quit();
	    }
	    
	
	    
	}


