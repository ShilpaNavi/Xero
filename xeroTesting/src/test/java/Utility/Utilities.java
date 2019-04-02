package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Utilities {
	
	private static HSSFSheet ExcelWSheet;

	private static HSSFWorkbook ExcelWBook;

	private static HSSFCell Cell;

	private static HSSFRow Row;



	public static void setExcelFile(String Path,String SheetName) throws Exception {
		 
	    try {

	      

	FileInputStream ExcelFile = new FileInputStream(Path);

	
	ExcelWBook = new HSSFWorkbook(ExcelFile);

	ExcelWSheet = ExcelWBook.getSheet(SheetName);

	} catch (Exception e){

	throw (e);

	}

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception{
		 
	    try{

	        Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

	        String CellData = Cell.getStringCellValue();
	        System.out.println(CellData);

	        return CellData;

	        }catch (Exception e){

	return"";

	        }

	  }

	//This method is to write in the Excel cell, Row num and Col num are the parameters

	public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

			try{

				Row  = ExcelWSheet.getRow(RowNum);

			Cell = Row.getCell(ColNum, org.apache.poi.ss.usermodel.Row.RETURN_BLANK_AS_NULL);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

				} else {

					Cell.setCellValue(Result);

				}

	// Constant variables Test Data path and Test Data file name

					FileOutputStream fileOut = new FileOutputStream(Constants.path_TestData + Constants.File_TestData);

					ExcelWBook.write(fileOut);

					fileOut.flush();

					fileOut.close();

				}catch(Exception e){

					throw (e);

			}

		}

}
