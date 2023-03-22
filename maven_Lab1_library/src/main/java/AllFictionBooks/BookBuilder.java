package AllFictionBooks;

import com.mycompany.mavenproject3.ExcelProvider;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract public class BookBuilder {
     
    protected String pathFiction = ".\\ListFictions.xlsx";
    protected ExcelProvider provider = new ExcelProvider();
    protected  AllFictionBooks book;
    
//    public void setProvider() throws IOException{
//        
//        ExcelProvider p = new ExcelProvider();
//     
//        this.provider = p;
//    }
    
    
    public void createBook() {
        this.book = new AllFictionBooks();
    }
    
    public AllFictionBooks getBook() { 
        return this.book;
    }
    
    public abstract void BuildName();
    public abstract void BuildAuthor();   
}


