package PeopleCreation;

 
import AllFictionBooks.AllFictionBooks;
import AllFictionBooks.DirectorFiction;
import AllFictionBooks.EngBookBuilder;
import AllFictionBooks.RusBookBuilder;
import com.mycompany.mavenproject3.Books;
import java.util.ArrayList;
 
public interface People {
    
    void setName(String name);
    void setSurName(String surname);
    void setMiddleName(String middlename);
    
    String getName();
    String getSurName();
    String getMiddleName();
    
    void takeEngFiction();
    void takeRusFiction();
    
    void takeEngTextBook();
    void takeRusTextBook();
    
    ArrayList<Books> GetBooks();
    
    
}


