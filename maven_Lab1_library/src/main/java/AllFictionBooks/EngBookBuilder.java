package AllFictionBooks;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EngBookBuilder extends BookBuilder{
    
    private String langBuilder = "Eng";

    protected String getLangBuilder(){
        return this.langBuilder;

    }
    
    
    @Override
    public void BuildName() { 
        try {
            
            this.provider.openFile(this.pathFiction);
            String name = null;
            name = this.provider.getValue("EngNames");
            this.provider.close();
            this.book.setName(name);
            
        } catch (IOException ex) {
            Logger.getLogger(EngBookBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

  
    @Override
    public void BuildAuthor() {
        try {
            
            this.provider.openFile(this.pathFiction);
            String author = null;
            author = this.provider.getValue("EngAuthors");
            this.provider.close();
            this.book.setAuthor(author);
            
        } catch (IOException ex) {
            Logger.getLogger(EngBookBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
