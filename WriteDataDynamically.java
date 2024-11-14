package Day19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataDynamically {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\DataDynamic.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet Sheet = workbook.createSheet("Sheet1");
		System.out.println("Enter no of rows:");
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		
		System.out.println("Enter no of cells in a row:");
		int cells=sc.nextInt();
		
		for(int r=0;r<rows;r++) {
			XSSFRow Currentrow=Sheet.createRow(r);
			for(int c=0;c<cells;c++) {
				XSSFCell cell= Currentrow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File is created");

	}
	

}
