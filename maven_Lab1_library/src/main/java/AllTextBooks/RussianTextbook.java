package AllTextBooks;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RussianTextbook extends AllTextbooks implements Textbooks{
    private String name;
    private String type;

    public RussianTextbook()
    {
        try {
            this.provider.openFile(this.pathTextbook);
            this.setName(this.provider.getValue("RusSubjects"));
            this.setType(this.provider.getValue("RusTypes"));
            this.provider.close();
        } catch (IOException ex) {
            Logger.getLogger(RussianTextbook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getType() {
        return type;
    }
    
    @Override
    public void setAuthor(String author) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setLevel(String level) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setUniversity(String university) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getAuthor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getLevel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUniversity() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

