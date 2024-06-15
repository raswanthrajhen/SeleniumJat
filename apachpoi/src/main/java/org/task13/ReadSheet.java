package org.task13;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String inputFilePath = "empty_sheet.xlsx";

	        try {
	            // Read from an existing XLSX file
	            FileInputStream inputStream = new FileInputStream(inputFilePath);
	            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
	            XSSFSheet sheet = workbook.getSheetAt(0); // Read the first sheet
	            
	         // Iterate through the rows and columns
	            for (Row row : sheet) {
	                for (Cell cell : row) {
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            System.out.print(cell.getStringCellValue() + "\t");
	                            break;
	                        case NUMERIC:
	                            if (DateUtil.isCellDateFormatted(cell)) {
	                                System.out.print(cell.getDateCellValue() + "\t");
	                            } else {
	                                System.out.print(cell.getNumericCellValue() + "\t");
	                            }
	                            break;
	                        case BOOLEAN:
	                            System.out.print(cell.getBooleanCellValue() + "\t");
	                            break;
	                        case FORMULA:
	                            System.out.print(cell.getCellFormula() + "\t");
	                            break;
	                        default:
	                            System.out.print("UNKNOWN\t");
	                            break;
	                    }
	                }
	                System.out.println();
	            }

	            // Close the workbook and input stream
	            workbook.close();
	            inputStream.close();
	            
	}
	        catch (IOException e) {
	            e.printStackTrace();
	        }

	}
}
