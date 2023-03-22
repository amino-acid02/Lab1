package PeopleCreation;
 
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public interface PeopleFactory {
    
    Student createStudent();
    Professor createProfessor();
    
    //void setProvider() ;
    
}











