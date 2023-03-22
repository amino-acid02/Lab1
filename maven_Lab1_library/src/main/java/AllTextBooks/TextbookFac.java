package AllTextBooks;
public class TextbookFac implements TextbookFactory {
    
    @Override
    public Textbooks createRusTextbook() {
        return new RussianTextbook();
    }

    @Override
    public Textbooks createEngTextbook() {
        return new EnglishTextbook();
    }
       
}
