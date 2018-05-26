package dataSource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ImportData {

	XSSFSheet sheet;
	File src;
	FileInputStream fis;
	XSSFWorkbook wb;
	
	public ImportData(String path)  {
		  src=new File(path);
		 try {
			fis=new FileInputStream(src);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			wb=new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		}
	
	public String getData(int sno,int row,int col) {
		sheet=wb.getSheetAt(sno);
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
		
	}
	
	
}
