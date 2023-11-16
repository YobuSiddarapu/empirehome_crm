package com.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utils {

	
       
		public static String[][] Data(String sheetname1) throws IOException {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Yobu\\git\\EmpireHome_Crm_project\\Empirehomecrm\\src\\main\\java\\com\\testdata\\empire3.xlsx");
			Workbook workbook = new XSSFWorkbook(fis);
			org.apache.poi.ss.usermodel.Sheet sheet1 = workbook.getSheet(sheetname1);

			int rowCount = sheet1.getLastRowNum();
			int colCount = sheet1.getRow(1).getLastCellNum();

			String[][] data = new String[rowCount][colCount];
			DataFormatter dataFormatter = new DataFormatter();
			for (int i = 1; i <= rowCount; i++) {
				Row row = sheet1.getRow(i);
				if (row != null) {
					for (int j = 0; j < colCount; j++) {
						Cell cell = row.getCell(j);
						if (cell != null) {

							data[i - 1][j] = dataFormatter.formatCellValue(cell);

						}

					}
				}
			}
			return data;

		}
	
public static void robot(String path) throws Throwable {
	Robot R=new Robot();
	R.delay(2000);
	StringSelection selection = new StringSelection(
			path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	R.keyPress(KeyEvent.VK_CONTROL);
	R.keyPress(KeyEvent.VK_V);
	R.keyRelease(KeyEvent.VK_V);
	R.keyRelease(KeyEvent.VK_CONTROL);
	R.keyPress(KeyEvent.VK_ENTER);
	R.keyRelease(KeyEvent.VK_ENTER);
	
}
public static void Select(WebElement value,int index) {
	Select sc=new Select(value);
	sc.selectByIndex(index);
}



public static void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException{
	 
  File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
  String currentDir= System.getProperty("user.dir");
 FileUtils.copyFile(srcFile, new File(currentDir + "/screenshot" + System.currentTimeMillis() + ".png"));
	
	
	
	
}


























}