package collectionPack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ArrarListDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ReadData rd=new ReadData();
		rd.getCellValue("Sheet1", 1);
	}

}

class ReadData{
	static String xlsPath = "D:/Study/Selenium practices/JavaConcept/src/collectionConcepts/Test Array List.xls";
	//ArrayList al = new ArrayList();
	public void getCellValue(String sheetName, int rowNum) throws IOException {
		//String cellValue;
		//System.out.println("getCellValue");
			FileInputStream fis = new FileInputStream(xlsPath);
			/*Workbook wb = WorkbookFactory.create(fis);
			//cellValue = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
			Sheet sheet =  wb.getSheet(sheetName);



            int numberOfCells = 0;
            Iterator rowIterator =  ((org.apache.poi.ss.usermodel.Sheet) sheet).rowIterator();
            *//**
             * Escape the header row *
             *//*
            if (rowIterator.hasNext())
            {
                Row headerRow = (Row) rowIterator.next();
                //get the number of cells in the header row
                numberOfCells = headerRow.getPhysicalNumberOfCells();
            }
            System.out.println("number of cells "+numberOfCells);*/
			/*for(int count=0;count<;count++){
			
				
			}*/
			//System.out.println(cellValue);
			//return sheetName;
		
			//cellValue="";
			//System.out.println("error "+e.getMessage());
		
		//return cellValue;
}
}
