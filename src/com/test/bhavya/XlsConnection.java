package com.test.bhavya;

import java.io.*;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class XlsConnection {

	public static void main(String[] args) {
		try{
			FileInputStream file = new FileInputStream(new File("test1.xlsx"));
			System.out.println("File found");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
		//	System.out.println("bhavya");
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
	//		System.out.println("chugh");
			while (rowIterator.hasNext()){
				Row row = rowIterator.next();
				Iterator<Cell> cell = row.cellIterator();
				while (cell.hasNext()){
					Cell cell1 = cell.next();{
						switch(cell1.getCellType()){
						case Cell.CELL_TYPE_NUMERIC:
							System.out.println(cell1.getNumericCellValue() + " ");
							break;
						case Cell.CELL_TYPE_STRING:
							System.out.println(cell1.getStringCellValue());
							break;
						}
						}
			//		System.out.println(" ");
					}
					
				file.close();
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		
			
			
			
		}
		

	}


