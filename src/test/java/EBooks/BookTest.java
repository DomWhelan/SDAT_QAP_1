/*

    Software Design, Architecture and Testing
    QAP - 1
    Developer: Dominic Whelan
    Date: Oct.01, 2022

 */
package EBooks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class BookTest {

//    private String title;
//    private String author;
//    private String genre;
//    private String datePublished;

    @Test
    public void testBookConstructor() {

        String expectedTitle = "Book Title";
        String expectedAuthor = "Author Name";
        String expectedGenre = "Book Genre";

        Book b1 = new Book(expectedTitle, expectedAuthor, expectedGenre);

        Assertions.assertEquals(expectedTitle, b1.getTitle());
        Assertions.assertEquals(expectedAuthor, b1.getAuthor());
        Assertions.assertEquals(expectedGenre, b1.getGenre());

    }


}
