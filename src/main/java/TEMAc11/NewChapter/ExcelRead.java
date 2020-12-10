package TEMAc11.NewChapter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;


public class ExcelRead {
    public static final String SAMPLE_XLSX_FILE_PATH = "./sample-xlsx-file.xlsx";
    public static final String SAMPLE_XLSX_FILE_PATH2 = "F:\\Cod\\asd.xlsx";

    public static void main(String[] args) throws IOException, InvalidFormatException {

        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH2));
        System.out.println("Woorkbook has:" + workbook.getNumberOfSheets() + " sheets");
        Sheet firstSheet = workbook.getSheetAt(0);
        Iterator<Row> rowIt = firstSheet.rowIterator();
        int count = firstSheet.getPhysicalNumberOfRows();
        System.out.println(count);
        while (rowIt.hasNext())
        {
            System.out.println("\n new row! \n");
            Row currentRow = rowIt.next();
            Iterator<Cell> cellIt = currentRow.cellIterator();

            while (cellIt.hasNext())
            {
                Cell next = cellIt.next();

                switch (next.getCellTypeEnum())
                {
                    case STRING:
                        System.out.print(next.getStringCellValue()+"||" );
                        break;
                    case NUMERIC:
                        System.out.print(next.getNumericCellValue()+"||");
                        break;
                    case BOOLEAN:
                        System.out.print(next.getBooleanCellValue()+"||");
                        break;
                }

            }

        }
    }
}
