package Day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// total no of rows
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("rows:"+rows);
		
		//total no of columns 
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
		System.out.println("cols:"+cols);
		
		//read data from specific row and specific column
		//String data= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[4]")).getText();
		//System.out.println("specific record:"+data);
		
		//read all the data from table
		/*for(int r=2;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+ "\t");
			}
			System.out.println();
		}*/
		
		//find book names whose Subject is Selenium
		/*for(int r=2;r<=rows;r++) {
		String Subject=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[3]")).getText();
		if(Subject.equals("Selenium")) {
			System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText());
		  }
		}*/
		// total price of all books
		int total=0;
		for(int r=2;r<=rows;r++) {
		String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		total=total+Integer.parseInt(price) ;
		}
		System.out.println(total);
	}

}
