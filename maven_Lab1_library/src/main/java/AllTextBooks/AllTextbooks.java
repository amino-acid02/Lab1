package AllTextBooks;

import com.mycompany.mavenproject3.Books;
import com.mycompany.mavenproject3.ExcelProvider;

public class AllTextbooks extends Books{

    protected String pathTextbook = "C:\\amina\\uni\\3year\\прога\\ListTextbooks.xlsx";
    protected ExcelProvider provider = new ExcelProvider(); 
    
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
        this.type = type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getLevel() {
        return this.level;
    }

    @Override
    public String getUniversity() {
        return this.university;
    }
    
}
