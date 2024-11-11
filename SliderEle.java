package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderEle {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act=new Actions(driver);
		//minimize of slider
		WebElement Slider_mini=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println("intial Location"+Slider_mini.getLocation());//59,249
		act.dragAndDropBy(Slider_mini, 100, 249).perform();
		System.out.println("After Location"+Slider_mini.getLocation());
		
		//maximize of slider
		WebElement Slider_max=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		System.out.println("maximized location"+Slider_max.getLocation());
		act.dragAndDropBy(Slider_max, -100, 249).perform();
		System.out.println("After Location"+Slider_max.getLocation());
		

	}

}
