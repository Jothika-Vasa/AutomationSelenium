package Day17;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class blockADs {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		File file=new File("C:\\Users\\jothi\\OneDrive\\Documents\\uBlockAds.crx");
		
		options.addExtensions(file);
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://text-compare.com/");

	}

}
