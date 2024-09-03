package saleniumbasic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
	
	public static void main(String[] args) throws IOException  {

		// Read the data from excel

		FileInputStream fs = new FileInputStream("D:/Vaishnavipatil.xlsx");
		// Took the control of excel file
		XSSFWorkbook w = new XSSFWorkbook(fs);

		// Took the control of sheet
		XSSFSheet sheet = w.getSheetAt(0);

		// Took the control of row
		Row row = sheet.getRow(1);

		// Too the control of cell
		Cell username = row.getCell(0);

		Cell password = row.getCell(1);

		System.out.println(username);
		System.out.println(password);

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/?locale=in");

		driver.findElement(By.xpath("//input[@type ='email']")).sendKeys(username.toString());

		driver.findElement(By.xpath("//input [@type ='password']")).sendKeys(password.toString());

		driver.findElement(By.xpath("//input[@name='Login']")).click();
		

	}



	

}


