package com.mycompany.mavenproject3;

import java.io.File;
import java.util.Random;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProvider {
    
    private File f;
    private FileInputStream fis;
    private XSSFWorkbook wb;
    
    public void openFile(String path) throws FileNotFoundException, IOException{
        
        this.f = new File(path);
	this.fis = new FileInputStream(this.f);
        this.wb= new XSSFWorkbook(this.fis);
              
    }
    
    public int getNrows(String sheetName) throws IOException {
        return this.wb.getSheet(sheetName).getPhysicalNumberOfRows();
 
    }
    
    public String getValue(String sheetName) throws IOException {
        Random rand = new Random();
        int rowNumber = rand.nextInt(this.getNrows(sheetName));
        String value = this.wb.getSheet(sheetName).getRow(rowNumber).getCell(0).getStringCellValue();
        return value;
     
    }
    
    public void close() throws IOException{  
        this.wb.close();
    
    }
        
}
