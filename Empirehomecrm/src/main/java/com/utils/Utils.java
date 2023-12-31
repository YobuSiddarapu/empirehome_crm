package com.utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Basetest;

public class Utils extends Basetest {

	
       
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
	
		public static void robot(String filepath) throws Throwable {
			
			Robot rb = new Robot();
			rb.delay(3000);
			
			StringSelection path = new StringSelection(filepath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			 
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
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
public static void waits(WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.invisibilityOf(element));
}
























}