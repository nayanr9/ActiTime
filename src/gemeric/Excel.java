package gemeric;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel{
	public static String getCellValue(String path, String sheet, int row, int cell){
		String value = "";
		try{
			Workbook wb = WorkbookFactory.create(new File(path));
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			value = c.toString();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return value;
	}

}
