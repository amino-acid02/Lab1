package PeopleCreation;
    
import com.mycompany.mavenproject3.ExcelProvider;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RealPeopleFactory implements PeopleFactory{
    
    protected ExcelProvider provider = new ExcelProvider();
    protected String studentPath = ".\\ListStudents.xlsx";
    protected String professorPath = ".\\ListTeachers.xlsx";

//    @Override
//    public void setProvider() {
//        
//        this.provider = new ExcelProvider();
//    }

    @Override
    public Student createStudent() {
         Student student = new Student();
         try {
            Random rand = new Random();
            this.provider.openFile(this.studentPath);
            int gender = rand.nextInt(2);
            if(gender == 1)
            {
                student.setName(this.provider.getValue("FemaleNames"));
                student.setSurName(this.provider.getValue("FemaleSurnames"));    
            } else
            {
                student.setName(this.provider.getValue("MaleNames"));
                student.setSurName(this.provider.getValue("MaleSurnames"));   
            }
                this.provider.close();
            } catch (IOException ex) {
             Logger.getLogger(RealPeopleFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        return student;
    }

    @Override
    public Professor createProfessor() {
         Professor professor = new Professor();
         try {
            Random rand = new Random(); 
            this.provider.openFile(this.professorPath);
            int gender = rand.nextInt(2);
            if(gender == 1)
            {
                professor.setName(this.provider.getValue("FemaleNames"));
                professor.setSurName(this.provider.getValue("FemaleSurnames"));
                professor.setMiddleName(this.provider.getValue("FemaleOtch"));    
            } else
            {
                professor.setName(this.provider.getValue("MaleNames"));
                professor.setSurName(this.provider.getValue("MaleSurnames"));
                professor.setMiddleName(this.provider.getValue("MaleOtch"));    
            }
            this.provider.close();        
            } catch (IOException ex) {
             Logger.getLogger(RealPeopleFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        return professor;
    }
}




