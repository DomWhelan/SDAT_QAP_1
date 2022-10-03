package EBooks;

public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String bookTitle, String bookAuthor, String bookGenre){
        this.title = bookTitle;
        this.author = bookAuthor;
        this.genre = bookGenre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String bookTitle) {
        this.title = bookTitle;
    }

    public void setAuthor(String bookAuthor) {
        this.author = bookAuthor;
    }

    public void setGenre(String bookGenre) {
        this.genre = bookGenre;
    }
}
