package Day20;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CDcalculator {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		
		
		String file=System.getProperty("user.dir")+"\\TestData\\CalCD.xlsx";
		int Rowcount= ExcelUtility.getRowCount(file, "Sheet1");
		System.out.println(Rowcount);
		int cellcount=ExcelUtility.getCellCount(file, "Sheet1", 0);
		System.out.println(cellcount);
		for(int r=1;r<=Rowcount;r++) {
			String ida= ExcelUtility.getCellData(file, "Sheet1", r, 0);
			String ir= ExcelUtility.getCellData(file, "Sheet1", r, 1);
			String month= ExcelUtility.getCellData(file, "Sheet1", r, 2);
			String com= ExcelUtility.getCellData(file, "Sheet1", r, 3);
			String total= ExcelUtility.getCellData(file, "Sheet1", r, 4);
			
			WebElement ids=driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			ids.clear();
			ids.sendKeys(ida);
			
			WebElement months=driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			months.clear();
			months.sendKeys(month);
			
			WebElement irs= driver.findElement(By.xpath("//input[@id='mat-input-2']"));
			irs.clear();
			irs.sendKeys(ir);
			
			driver.findElement(By.xpath("//div[@id='mat-select-value-1']")).click();
			List<WebElement> options= driver.findElements(By.xpath("//span[@class='mat-option-text']"));
			for(WebElement option:options) {
				
				if(option.getText().equals(com)) 
				{
					option.click();
				}
			}	
			
			
			driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")).click();
			
			String TotalValue=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();
			String tv=TotalValue.substring(1);
			System.out.println(tv);
			Double value1=Double.parseDouble(total);
			Double value2=Double.parseDouble(tv);
			//Validation
			if(value1== value2) {
				System.out.println("Test Passed :  "+r );
				ExcelUtility.setCellData(file, "Sheet1", r, 6, "Pass");
				ExcelUtility.fillGreenColor(file, "Sheet1", r, 6);
				
			}
			else {
				System.out.println("Test Failed :  "+r );
				ExcelUtility.setCellData(file, "Sheet1", r, 6, "Fail");
				ExcelUtility.fillRedColor(file, "Sheet1", r, 6);
			}
			
		}
		driver.quit();
		

	}

	}
