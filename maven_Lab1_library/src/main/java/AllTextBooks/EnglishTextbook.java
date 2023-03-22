package AllTextBooks;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnglishTextbook extends AllTextbooks implements Textbooks{
    private String name;
    private String author;
    private String level;
    private String university;
    
    public EnglishTextbook()
    { 
        try {
            this.provider.openFile(this.pathTextbook);
            this.setName(this.provider.getValue("EngSubjects"));
            this.setAuthor(this.provider.getValue("EngAuthors"));
            this.setUniversity(this.provider.getValue("EngUniversities"));
            this.setLevel(this.provider.getValue("EngLevels"));
            this.provider.close();
        } catch (IOException ex) {
            Logger.getLogger(EnglishTextbook.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void setType(String type) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getLevel() {
        return level;
    }

    @Override
    public String getUniversity() {
        return university;
    }
}
