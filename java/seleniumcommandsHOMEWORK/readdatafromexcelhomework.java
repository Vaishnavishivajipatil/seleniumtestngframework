package seleniumcommandsHOMEWORK;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdatafromexcelhomework {



	

	public static void main(String[] args) throws IOException {

		FileInputStream fs = new FileInputStream("D:/Vaishnavipatil.xlsx");
		// Took the control of excel file
		XSSFWorkbook w = new XSSFWorkbook(fs);

		// Took the control of sheet
		XSSFSheet sheet = w.getSheetAt(0);

		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			
			// Took the control of row
			Row row = sheet.getRow(i);

	
		  for(int j=0; j<=4; j++) {
			  Cell cell=row.getCell(j);
			Cell data=row.getCell(0) ; 
			  System.out.println(data);
			  
			  
		  }

		// Too the control of cell
		Cell username = row.getCell(0);
		Cell password = row.getCell(1);

		System.out.println(username);
		System.out.println(password);

	}
	}
}
