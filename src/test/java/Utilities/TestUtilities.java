package Utilities;

import TestBase.TestBase;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestUtilities extends TestBase {

    public static long Page_Load_Timeout = 20;
    public static long ImplicitWat =20;

    public static String TESTDATA_SHEET_PATH="C:/Users/vishwa/MavenProject/src/test/java/TestData/testdata.xlsx";
    static Workbook book;
    static Sheet sheet;


    public static Object[][] getTestData(String sheetName) {

        try {
            FileInputStream  file = new FileInputStream(TESTDATA_SHEET_PATH);
                    book = WorkbookFactory.create(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        sheet = book.getSheet(sheetName);
        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        // System.out.println(sheet.getLastRowNum() + "--------" +
        // sheet.getRow(0).getLastCellNum());
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                // System.out.println(data[i][k]);
            }
        }
        return data;
    }

    public static void takeScreenshotAtEndOfTest() throws IOException {
        File scrFile = ((TakesScreenshot) drivertb).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
       FileUtils.copyFile(scrFile, new File(currentDir + "/projectscreenshots/" + System.currentTimeMillis() + ".png"));
    }

}

