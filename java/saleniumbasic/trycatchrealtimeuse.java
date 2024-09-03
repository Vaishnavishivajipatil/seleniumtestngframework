package saleniumbasic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class trycatchrealtimeuse {

	String path = "D:/Vaishnavipatil.xlsx";

	FileInputStream fs = new FileInputStream(path);

// Took the control of excel file
	XSSFWorkbook wb = new XSSFWorkbook(fs);

// Took the control of sheet
	XSSFSheet sheet = wb.getSheetAt(1);

	for(
	int i = 0;i<=sheet.getLastRowNum();i++)

	{

		Row row;
		Cell cell;
		try {

			// fetch the row
			row = sheet.getRow(i); // //0

			// fetch the cell
			cell = row.getCell(0); // 0

			if (cell != null) {

				// create the cell
				cell = row.createCell(1);

				// set the value inside the cell
				cell.setCellValue("10");

			} else {

				cell = row.createCell(1);
				// set the value inside the cell
				cell.setCellValue("0");

			}

		} catch (Exception e) {

			// create the row
			row = sheet.createRow(i);

			// fetch the row
			row = sheet.getRow(i);

			// create the cell
			cell = row.createCell(1);

			// set the set value
			cell.setCellValue("0");

		}

	}

	FileOutputStream fos = new FileOutputStream(path);wb.write(fos);fos.close();

}

}
