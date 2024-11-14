package Day19;

import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataManually {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\DataManually.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		XSSFRow r1=sheet.createRow(0);
		   r1.createCell(0).setCellValue("Java");
		   r1.createCell(1).setCellValue("yes");
		   r1.createCell(2).setCellValue(6);
		XSSFRow r2=sheet.createRow(1);
		   r2.createCell(0).setCellValue("Automation");
		   r2.createCell(1).setCellValue("yes");
		   r2.createCell(2).setCellValue(6);
		   
		XSSFRow r3=sheet.createRow(2);
		   r3.createCell(0).setCellValue("Python");
		   r3.createCell(1).setCellValue("yes");
		   r3.createCell(2).setCellValue(6);
		   
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("file is created");
	

	}

}
