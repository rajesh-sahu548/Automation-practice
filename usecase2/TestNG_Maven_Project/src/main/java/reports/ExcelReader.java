package reports;



import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelReader {

public static Object[][] readExcel() throws Exception {

	FileInputStream fis =
	        new FileInputStream("C:\\Users\\rahul sahu\\Downloads\\data.xlsx");



XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet = wb.getSheet("Sheet1");

int rows = sheet.getPhysicalNumberOfRows();
int cols = sheet.getRow(0).getPhysicalNumberOfCells();

Object[][] data = new Object[rows-1][cols];

for(int i=1;i<rows;i++) {
for(int j=0;j<cols;j++) { 
data[i-1][j] = sheet.getRow(i).getCell(j).toString();
}
}

wb.close();
return data;
}

//public static Object[][] getExcelData(String string) {
//	// TODO Auto-generated method stub
//	return null;
//}
}
