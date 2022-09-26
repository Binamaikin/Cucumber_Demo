//package Util_Raghav;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelUtil{
//	
//	public static void main(String[] args) {
//		
//	}
//	public static void GetRowCount() {
//		
//	String projDir=	System.getProperty("user.dir");
//		System.out.println(projDir);
//		@SuppressWarnings("unused")
//		String excelPath="/data/TestData.xlsx";
//		@SuppressWarnings("resource")
//		XSSFWorkbook workbook =new XSSFWorkbook();
//		XSSFSheet sheet= workbook.getSheet("sheet1");
//		@SuppressWarnings("unused")
//		int rowCount= sheet.getPhysicalNumberOfRows();
//		System.out.println("No of Rows");
//	}
//}