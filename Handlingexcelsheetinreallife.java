package Testngbatch64;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingexcelsheetinreallife {

	public static void main(String[] args) throws Exception {
		FileInputStream f= new FileInputStream("C:\\\\testdata-folder\\\\testdate-sheet.xlsx");
		
		Workbook f1=WorkbookFactory.create(f);
		
		//String s=f1.getSheet("Bha").getRow(0).getCell(0).getStringCellValue();
		
		ChromeDriver b= new ChromeDriver();
		b.get("https://www.amazon.in/");
		b.manage().window().maximize();
	/*	Thread.sleep(3000);
	WebElement f3=	b.findElement(By.id("twotabsearchtextbox"));
	f3.sendKeys(s + Keys.ENTER);*/
	
	// ined to deal with numeric values
	String s2=NumberToTextConverter.toText(f1.getSheet("Bha").getRow(1).getCell(0).getNumericCellValue());

	Thread.sleep(3000);
	WebElement f3=	b.findElement(By.id("twotabsearchtextbox"));
	f3.sendKeys(s2 + Keys.ENTER);
	
	
	}

}
