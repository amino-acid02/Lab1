package PeopleCreation;

import AllFictionBooks.DirectorFiction;
import AllFictionBooks.EngBookBuilder;
import AllFictionBooks.RusBookBuilder;
import com.mycompany.mavenproject3.Books;
import AllTextBooks.TextbookFac;
import AllTextBooks.Textbooks;
import java.util.ArrayList;

public class Professor implements People {
    
    private String name;
    private String surname;
    private String middlename;

    ArrayList<Books> books = new ArrayList();
    DirectorFiction dir = new DirectorFiction(); 
    TextbookFac factory = new TextbookFac();
    
    @Override
    public void setName(String name) {
     this.name = name;
    }
    
    @Override
    public void setSurName(String surname) {
        this.surname = surname; 
    }
    
    @Override
    public void setMiddleName(String middlename) {
        this.middlename = middlename; 
    }
       
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public String getSurName() {
        return this.surname;
    }
    
    @Override
    public String getMiddleName() {
        return this.middlename;
    }
    
    @Override
    public void takeEngFiction() {
        this.dir.setEngBuilder(new EngBookBuilder());
        this.dir.makeEngBook();
        Books engFiction = this.dir.getEngBook();
        books.add((Books)engFiction);
        
    }

    @Override
    public void takeRusFiction() {
        this.dir.setRusBuilder(new RusBookBuilder());
        this.dir.makeRusBook();
        Books rusFiction = this.dir.getRusBook();
        books.add((Books)rusFiction);
        
    }

    @Override
    public void takeEngTextBook() {    
        Textbooks textbookEng = this.factory.createEngTextbook();
        books.add((Books) textbookEng);
    
    }

    @Override
    public void takeRusTextBook() {
     Textbooks textbookRus =   this.factory.createRusTextbook();
       books.add((Books) textbookRus);
       
    }

    @Override
    public ArrayList<Books> GetBooks() {
        return this.books;  
    }
    
}
