package Day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPagination {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		int count=driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();//4
		System.out.println(count);
		
		System.out.println("ID"+"\t"+"Name"+"\t"+"Price"+"\t");
		//pages
		for(int i=1;i<=count;i++) {
			if(i>1) {
				driver.findElement(By.xpath("//a[normalize-space()="+i+"]")).click();
			}
			//rows
			int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			for(int r=1;r<=rows;r++) {
				String Id= driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[1]")).getText();
				String Name=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[2]")).getText();
				String Price=driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[3]")).getText();
				
				driver.findElement(By.xpath("//table[@id='productTable']//tr["+r+"]//td[4]//input[1]")).click();
				Thread.sleep(2000);
				System.out.println(Id+"\t"+Name+"\t"+Price);
			}
		}

	}

}
