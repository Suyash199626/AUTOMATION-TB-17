package com_cjc_utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;


public class Commons 
{
	
	 	  public static WebDriver driver; 
	 	  public  static FileInputStream fis; 
	 	  public static XSSFWorkbook aw; 
	 	  public static XSSFSheet sheet; 
	 	  public static XSSFRow row; 
	 	  public static XSSFCell cell; 
	 	  
	 	  public static FileInputStream fineCall() throws FileNotFoundException  
	 	  {
	 	  fis=new FileInputStream("C:\\Users\\suyas\\OneDrive\\Desktop\\new suyash\\excel files\\demoblazedddframework.xlsx"); 
	 	 return fis; 
	 	  }
	 	 
	 	  public static String name() throws IOException 
	 	  {
	 	  fis=new FileInputStream("C:\\Users\\suyas\\OneDrive\\Desktop\\new suyash\\excel files\\demoblazedddframework.xlsx");
	 		  aw=new XSSFWorkbook(fis); 
	 		   sheet=aw.getSheet("Sheet1"); 
	 		   row=sheet.getRow(1); 
	 		   cell=row.getCell(0); 
	 		   String name=cell.getStringCellValue();
	 		return name;
	 	  }
	 	  
	 	  public static String country() throws IOException 
	 	  {
	 	  fis=new FileInputStream("C:\\Users\\suyas\\OneDrive\\Desktop\\new suyash\\excel files\\demoblazedddframework.xlsx");
	 		  aw=new XSSFWorkbook(fis); 
	 		   sheet=aw.getSheet("Sheet1"); 
	 		   row=sheet.getRow(1); 
	 		   cell=row.getCell(1); 
	 		   String cntry=cell.getStringCellValue();
	 		return cntry;
	 		
	 	
	 	  }
	 	
	 	  public static String city() throws IOException 
	 	  {
	 	  fis=new FileInputStream("C:\\Users\\suyas\\OneDrive\\Desktop\\new suyash\\excel files\\demoblazedddframework.xlsx");
	 		  aw=new XSSFWorkbook(fis); 
	 		   sheet=aw.getSheet("Sheet1"); 
	 		   row=sheet.getRow(1); 
	 		   cell=row.getCell(2); 
	 		   String cty=cell.getStringCellValue();
	 		return cty;
	 		
	 	
	 	  }
	 	  
	 	  public static String creditcard() throws IOException 
	 	  {
	 	  fis=new FileInputStream("C:\\Users\\suyas\\OneDrive\\Desktop\\new suyash\\excel files\\demoblazedddframework.xlsx");
	 		  aw=new XSSFWorkbook(fis); 
	 		   sheet=aw.getSheet("Sheet1"); 
	 		   row=sheet.getRow(1); 
	 		   cell=row.getCell(3); 
	 		   String cc=cell.getStringCellValue();
	 		return cc;
	 		
	 	
	 	  }
	 	  
	 	  public static String month() throws IOException 
	 	  {
	 	  fis=new FileInputStream("C:\\Users\\suyas\\OneDrive\\Desktop\\new suyash\\excel files\\demoblazedddframework.xlsx");
	 		  aw=new XSSFWorkbook(fis); 
	 		   sheet=aw.getSheet("Sheet1"); 
	 		   row=sheet.getRow(1); 
	 		   cell=row.getCell(4); 
	 		   String mnth=cell.getStringCellValue();
	 		return mnth;
	 		
	 	
	 	  }
	 	
	 	  public static String year() throws IOException 
	 	  {
	 	  fis=new FileInputStream("C:\\Users\\suyas\\OneDrive\\Desktop\\new suyash\\excel files\\demoblazedddframework.xlsx");
	 		  aw=new XSSFWorkbook(fis); 
	 		   sheet=aw.getSheet("Sheet1"); 
	 		   row=sheet.getRow(1); 
	 		   cell=row.getCell(5); 
	 		   String yr=cell.getStringCellValue();
	 		return yr;
	 		
	 	
	 	  }
	 	


	 }


