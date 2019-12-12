package simpleJavaApp.dataBase;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;


public class ExportList {

    public static void main(String[] args) {

        try {
            XSSFWorkbook workbook = new XSSFWorkbook();

            XSSFSheet sheet = workbook.createSheet("EmployeeList");// creating a blank sheet
            int rownum = 0;
            for (Employee employee : EmployeeList.dataBaseList) {
                Row row = sheet.createRow(rownum++);
                createList(employee, row);
            }

            FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Komputer\\IdeaProjects\\SimpleJavaApp\\NewFile.xlsx")); // file name with path
            workbook.write(out);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void createList(Employee employee, Row row) // creating cells for each row
    {
        Cell cell = row.createCell(0);
        cell.setCellValue(Employee.getId());

        cell = row.createCell(1);
        cell.setCellValue(employee.getName());


    }
}


