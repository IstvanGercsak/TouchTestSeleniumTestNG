//package LoginPageTest;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Iterator;
//
///**
// * A dirty simple program that reads an Excel file.
// *
// * @author www.codejava.net
// */
//public class SimpleExcelReaderExample {
//
//    public static void main(String[] args) throws IOException {
//
//        String[] Array = new String[4];
//        int i = 0;
//        String excelFilePath = "data.xlsx";
//        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
//
//        Workbook workbook = new XSSFWorkbook(inputStream);
//        Sheet firstSheet = workbook.getSheetAt(0);
//        Iterator<Row> iterator = firstSheet.iterator();
//
//        while (iterator.hasNext()) {
//            Row nextRow = iterator.next();
//            Iterator<Cell> cellIterator = nextRow.cellIterator();
//
//            while (cellIterator.hasNext()) {
//                Cell cell = cellIterator.next();
//
//                switch (cell.getCellType()) {
//                    case Cell.CELL_TYPE_STRING:
//                        break;
//                }
//                Array[i] = cell.getStringCellValue();
//                i++;
//            }
//            System.out.println();
//        }
//
//        for (String s : Array) {
//            System.out.println(s);
//        }
//        inputStream.close();
//    }
//}