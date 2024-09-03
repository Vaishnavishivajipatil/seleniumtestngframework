package seleniumcommandsHOMEWORK;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class writeintoexcel {
	public static void main(String[] args) throws IOException {
		String path = "D:/Vaishnavipatil.xlsx";
		FileInputStream fs = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		Sheet sheet1 = wb.getSheetAt(0);
		
		int lastRow = sheet1.getLastRowNum();
		
		for(int i=0; i<=lastRow; i++){
		
			Row row = sheet1.getRow(i);
			
			for(int j=0; j<row.getLastCellNum(); j++) {

			Cell cell = (Cell) row.createCell(j);
            cell.setCellValue("hi");

            
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		fos.close();
	
		}
	}
}
}

	

