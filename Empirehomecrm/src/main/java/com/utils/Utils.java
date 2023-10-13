package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Utils {

	public static class utils {

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
	}

}