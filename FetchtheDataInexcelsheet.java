package Testngbatch64;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchtheDataInexcelsheet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream f= new FileInputStream("C:\\testdata-folder\\testdate-sheet.xlsx");
		
		//step second
	Workbook f2=	WorkbookFactory.create(f);
	
	//step3 finding sheet name
Sheet s1=	f2.getSheet("Sheet1");
Row f9=s1.getRow(0);
Cell	f10=f9.getCell(0);
double d=f10.getNumericCellValue();
System.out.println(d);
		

	}

}
