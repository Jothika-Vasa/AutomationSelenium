package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploadfiles {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		//single file
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Git Project\\text.txt");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Comm.java")){
			System.out.println("Correct");
		}
		else {
			System.out.println("Failed Macha");
		}

		
		//Multiple files
		String file1="C:\\Git Project\\Comm.java";
		String file2="C:\\Git Project\\Sele.java";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int count=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		System.out.println(count);
		if(count==2) {
			System.out.println("we did macha");
		}
		else {
			System.out.println("No Macha");
		}
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Comm.java") &&
		driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Sele.java")) {
			System.out.println("we did macha");
		}
		else {
			System.out.println("No Macha");
		
		}
		
	}

}
