package Day14;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDuplicaValues {

	public static void main(String[] args) {
    WebDriver driver=new FirefoxDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Have Duplicate Values
		WebElement colours= driver.findElement(By.xpath("//select[@id='colors']"));
		
		Select colour=new Select(colours);
		
		Set<String> UniqueVal=new HashSet<String>();
		boolean flag=true;
		for(WebElement option:colour.getOptions()) {
			String Options=option.getText();
			if(!UniqueVal.add(Options)) {
				System.out.println("Duplicate Value: "+Options);
				flag=false;
			}
			
		}
		
		if(flag) {
			System.out.println("No Duplicate  Values Macha");
		}
		
		//Have no Duplicate Values 
		
		WebElement  AnimalsList=driver.findElement(By.xpath("//select[@id='animals']"));
		Select Animals=new Select(AnimalsList);
		boolean flag1=true;
		Set<String> UniqueName= new HashSet<String>();
		for(WebElement Options1:Animals.getOptions()) {
			String animal=Options1.getText();
			if(!UniqueName.add(animal)) {
				System.out.println("Duplicate Values: "+animal);
				flag1=false;
			}
			
		}
		if(flag1) {
			System.out.println("No Duplicate  Values Macha");
		}

	}

}
