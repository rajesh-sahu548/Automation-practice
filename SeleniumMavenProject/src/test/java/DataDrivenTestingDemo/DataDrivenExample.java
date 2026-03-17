package DataDrivenTestingDemo;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataDrivenExample {

    public static void main(String[] args)
            throws EncryptedDocumentException, IOException {

    	String filePath = "C:\\Users\\rahul sahu\\Downloads\\Technocrats- Testing & Data- Training Shorlisted Candidates.xlsx";


         FileInputStream fis = new FileInputStream(filePath);
         Workbook workbook = new XSSFWorkbook(fis);
         Sheet sheet = workbook.getSheetAt(0);

         DataFormatter formatter = new DataFormatter(); // 🔥 KEY LINE

         for (Row row : sheet) {

             if (row.getRowNum() == 0) continue; // skip header

             String id = formatter.formatCellValue(row.getCell(0));
             String name = formatter.formatCellValue(row.getCell(1));

             System.out.println(id + "  " + name);
         }

         workbook.close();
         fis.close();
    }
}