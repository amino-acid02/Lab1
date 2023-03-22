package AllFictionBooks;

import com.mycompany.mavenproject3.Books;
import java.util.HashMap;
import java.util.Map;

public class DirectorFiction {
    
    public Map<String,BookBuilder> dictBuilders = new HashMap<String,BookBuilder>();
    
    public void setEngBuilder(BookBuilder exactEngBuilder) {
        dictBuilders.put("EngBuilder", exactEngBuilder);

    }
    
    public void setRusBuilder(BookBuilder exactRusBuilder) {
        dictBuilders.put("RusBuilder", exactRusBuilder);

    }

    public void makeRusBook() {
        this.dictBuilders.get("RusBuilder").createBook();
        this.dictBuilders.get("RusBuilder").BuildName();
        this.dictBuilders.get("RusBuilder").BuildAuthor();
        
    }

    public void makeEngBook() {
        this.dictBuilders.get("EngBuilder").createBook();
        this.dictBuilders.get("EngBuilder").BuildName();
        this.dictBuilders.get("EngBuilder").BuildAuthor();
        
    }
    public Books getEngBook(){
      return (Books)this.dictBuilders.get("EngBuilder").getBook();    
    }
    public Books getRusBook(){
        return (Books)this.dictBuilders.get("RusBuilder").getBook();
    }
   
}
