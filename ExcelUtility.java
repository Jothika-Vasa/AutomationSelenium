package Day20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static FileInputStream fi;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	public static XSSFRow r;
	public static XSSFCell c;
	public static FileOutputStream fo;
	public static CellStyle style;
	
	public static int getRowCount(String FileName,String SheetName) throws IOException {
		fi= new FileInputStream(FileName);
		w= new XSSFWorkbook(fi);
		s= w.getSheet(SheetName);
		int rowcount=s.getLastRowNum();
		w.close();
		fi.close();
		return rowcount;
	}
	
	public static int getCellCount(String FileName,String SheetName,int rownum) throws IOException {
		fi= new FileInputStream(FileName);
		w= new XSSFWorkbook(fi);
		s=w.getSheet(SheetName);
		r=s.getRow(rownum);
		int cellcount=r.getLastCellNum();
		w.close();
		fi.close();
		return cellcount;
	}
	
	public static String getCellData(String FileName,String SheetName,int rownum,int cellnum) throws IOException {
		fi= new FileInputStream(FileName);
		w= new XSSFWorkbook(fi);
		s=w.getSheet(SheetName);
		r=s.getRow(rownum);
		c=r.getCell(cellnum);
		String data;
		
		try{
			//data = c.toString();
			DataFormatter formatter=new DataFormatter();
			data=formatter.formatCellValue(c);
		}
		catch(Exception e){
			data=" ";
		}
		w.close();
		fi.close();
		return data;
	}
	public static void setCellData(String FileName,String SheetName,int rownum,int cellnum,String data) throws IOException {
		
		fi=new FileInputStream(FileName);
		w= new XSSFWorkbook(fi);
		s=w.getSheet(SheetName);
		r=s.getRow(rownum);
		c=r.createCell(cellnum);
		c.setCellValue(data);
		fo= new FileOutputStream(FileName);
		w.write(fo);
		w.close();
		fi.close();
		fo.close();
	}
	public static void fillGreenColor(String FileName, String SheetName, int rownum, int colnum) throws IOException{

	fi=new FileInputStream(FileName);
	w=new XSSFWorkbook(fi); 
	s=w.getSheet(SheetName);
	r=s.getRow(rownum); 
	c=r.getCell(colnum);
	style=w.createCellStyle();
	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	style.setFillPattern (FillPatternType.SOLID_FOREGROUND);
	c.setCellStyle(style);
	fo=new FileOutputStream(FileName);
	w.write(fo);
	w.close();
	fi.close();
	fo.close();
	}
	public static void fillRedColor(String FileName, String SheetName, int rownum, int colnum) throws IOException{

		fi=new FileInputStream(FileName);
		w=new XSSFWorkbook(fi); 
		s=w.getSheet(SheetName);
		r=s.getRow(rownum); 
		c=r.getCell(colnum);
		style=w.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern (FillPatternType.SOLID_FOREGROUND);
		c.setCellStyle(style);
		fo=new FileOutputStream(FileName);
		w.write(fo);
		w.close();
		fi.close();
		fo.close();
		}
	
}
