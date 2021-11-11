package tests.day17_ExcelAutomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {
    @Test

    public void readExcelFile() throws IOException {

        String path="src/test/java/resuorses/ulkeler.xlsx";

        FileInputStream fileInputStream= new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        //İndex O dan başlııyor birinci s
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(2);
        Cell cell = row.getCell(2);


        System.out.println("1.cell deki data " +cell);
        System.out.println("2.cell deki data "+ row.getCell(1));





    }


}
