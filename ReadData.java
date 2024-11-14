package Day19;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\CoursesData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		int cells=sheet.getRow(0).getLastCellNum();
		System.out.println(rows+":Row Count "+cells+":Cell Count");
		for(int r=0;r<=rows;r++) {
			XSSFRow Currentrow=sheet.getRow(r);
			for(int c=0;c<cells;c++) {
				XSSFCell cell=Currentrow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
	workbook.close();
	file.close();
	}

}
