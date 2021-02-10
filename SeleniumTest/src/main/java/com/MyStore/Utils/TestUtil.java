package com.MyStore.Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.MyStore.Base.TestBase;

public class TestUtil extends TestBase
{
	public static long PAGE_LOAD_TIMEOUT = 5000;
	public static long IMPLICIT_WAIT = 5000;
	
	
	public Object[][] getData(String File_Path, String Sheet_Name) throws IOException 
	{
		FileInputStream fis = new FileInputStream(File_Path);

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet(Sheet_Name);

		int row = s.getLastRowNum()-s.getFirstRowNum();
		Row r = s.getRow(1);
		int col = r.getLastCellNum();

		//System.out.println("Row size" + row);
		//System.out.println("col size" + col);
		String[][] tabArray = new String[row][col];

		for (int i = 1; i <= row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				tabArray[i-1][j] = s.getRow(i).getCell(j).getStringCellValue();
				System.out.println(tabArray[i - 1][j]);
			}
		}
		return tabArray;

	}


}
