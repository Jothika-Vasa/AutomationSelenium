package Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSortEle {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Already sorted Original List 
		WebElement AnimalsList=driver.findElement(By.xpath("//select[@id='animals']"));
		Select animals=new Select(AnimalsList);
		
		ArrayList orginalList= new ArrayList();
		ArrayList TempList=new ArrayList();
		
		List<WebElement>options=animals.getOptions();
		
		for(WebElement option:options) {
			orginalList.add(option.getText());
			TempList.add(option.getText());
		}
		Collections.sort(TempList);
		System.out.println(orginalList);
		System.out.println(TempList);
		
		if(TempList.equals(orginalList)) {
			System.out.println("Same Macha");
		}
		else
		{
			System.out.println("NO Macha");
		}
		
		//unsorted Original List
		WebElement unsort= driver.findElement(By.xpath("//select[@id='colors']"));
		Select colour=new Select(unsort);
		ArrayList original = new ArrayList();
		ArrayList templist=new ArrayList();
		
		List<WebElement> colours=colour.getOptions();
		
		for(WebElement colourop:colours) {
			original.add(colourop.getText());
			templist.add(colourop.getText());
			
		}
		
		Collections.sort(templist);
		System.out.println(original);
		System.out.println(templist);
		if(original.equals(templist)) {
			System.out.println("Same Macha");
		}
		else {
			System.out.println("Not same macha");
		}
		
		

	}

}
