package Day9;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanmicRowsandCols {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("//table[@class='table table-striped']//tbody/tr")).size();
		System.out.println(rows+":rows count ");
		for (int r=1;r<=rows;r++) {
			WebElement cols=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody/tr["+r+"]//td[1]"));
			if(cols.getText().equals("Chrome")) {
				String Cpu= driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]")).getText();
				System.out.println("CPU:"+Cpu);
				String value=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
				if(value.contains(Cpu)) {
					System.out.println("Equal");
				}
				else {
					System.out.println("not equal");
				}
				break;
			}
			
		}

	}

}