package org.task13;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Create WorkBook
// Create sheet
// Write Date Excell Sheet

public class CreateSheet {
	
	public static void main(String[] args) throws IOException {
		 // Create a new workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create an empty sheet in the workbook
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        
        Object[][] sampleData = {
                {"Name", "Age", "Email"},
                {"jhon Deo", "30","jhon@test.com"},
                {"bob smith", "35","jacky@example.com"},
                {"swapnil", "37", "swapnil@example.com"}
            };
        
        
        int rowCount = 0;
        for(Object[] rowData: sampleData) {
        	Row row = sheet.createRow(rowCount++);
            int columnCount = 0;

            for (Object field : rowData) {
                Cell cell = row.createCell(columnCount++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
        }
        }
        
        // Write the output to a file
        try (FileOutputStream outputStream = new FileOutputStream("empty_sheet.xlsx")) {
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Excel file created successfully.");
	}

}

/*			The Output of Program                          
 * 			Excel file created successfully.
 * 			
 * 			The excel file is create in name of ""empty_sheet.xlsx""
 * 
 */
