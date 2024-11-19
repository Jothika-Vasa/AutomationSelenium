package Day20;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDcalculator {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		
		String File=System.getProperty("user.dir")+"\\Testdata\\CalFD.xlsx";
		//row count
		int rowcount=ExcelUtility.getRowCount(File, "Sheet1");
		//Reading Data From Excel
		for(int r=1;r<=rowcount;r++) {
			
			String pri=ExcelUtility.getCellData(File, "Sheet1", r, 0);
			String roi=ExcelUtility.getCellData(File, "Sheet1", r, 1);
			String periodnum=ExcelUtility.getCellData(File, "Sheet1", r, 2);
			String periodyear=ExcelUtility.getCellData(File, "Sheet1", r, 3);
			String Freq=ExcelUtility.getCellData(File, "Sheet1", r, 4);
			String MaturityV=ExcelUtility.getCellData(File, "Sheet1", r, 5);
			
			//passing Data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pri);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(roi);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(periodnum);
			Select days=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			days.selectByVisibleText(periodyear);
			Select fre=new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fre.selectByVisibleText(Freq);
			//click on calculator
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			//Validation
			String Exp_Val=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			if(Double.parseDouble(Exp_Val) == Double.parseDouble(MaturityV)) 
			{
				System.out.println("row :"+r+"Test Passed");
				ExcelUtility.setCellData(File, "Sheet1", r, 7, "Pass"	);
				ExcelUtility.fillGreenColor(File,"Sheet1", r, 7);
		    }
			else {
				System.out.println("row :"+r+"Test Failed");
				ExcelUtility.setCellData(File, "Sheet1", r, 7, "Fail"	);
				ExcelUtility.fillRedColor(File, "Sheet1", r, 7);
			}
			
			driver.findElement(By.xpath("//img[@class='PL5']")).click(); // click on clear
			
		}
		driver.quit();

	}

}
