package genericlibraryforsp;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is generic class to fetch data from excel
 * @author praveen
 *
 */
public class ExcelUtility {
/**
 * This is generic method to fetch data from excel
 * @param sheetname
 * @param rownum
 * @param cellnum
 * @return
 * @throws Exception
 */
public String getDatafromExcel(String sheetname,int rownum,int cellnum) throws Exception
{
	FileInputStream fis=new FileInputStream(IconstantUtility.ExcelPath);
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(sheetname);
	DataFormatter df=new DataFormatter();
	String DATA=df.formatCellValue(sh.getRow(rownum).getCell(cellnum));
	return DATA;
}
}
