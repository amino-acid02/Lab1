package AllFictionBooks;

import com.mycompany.mavenproject3.ExcelProvider;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RusBookBuilder extends BookBuilder{
           
    private String langBuilder = "Rus";
    
    protected String getLangBuilder() {
        return this.langBuilder;

    }

//    public void setProvider(ExcelProvider provider) {
//        this.provider = provider;
//    }
//    
    
    
    @Override
    public void BuildName() {  
        
        try {
            this.provider.openFile(this.pathFiction);
            String name = null;
            name = this.provider.getValue("RusNames");
            this.provider.close();
            this.book.setName(name);
            
        } catch (IOException ex) {
            Logger.getLogger(RusBookBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void BuildAuthor() {
        
        try {
            this.provider.openFile(this.pathFiction);
            String author = null;
            author = this.provider.getValue("RusAuthors");
            this.provider.close();
            this.book.setAuthor(author);
        } catch (IOException ex) {
            Logger.getLogger(RusBookBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
