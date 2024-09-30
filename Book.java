class Book {
    
    private String bookName;
    private String isbn;
    private String authorName;
    private String publisher;


    public Book(String bookName, String isbn, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.authorName = authorName;
        this.publisher = publisher;
    }

  
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public String getBookName() {
        return bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }


    public String getBookInfo() {
        return "Book Name: " + bookName + "\n" +
               "ISBN: " + isbn + "\n" +
               "Author: " + authorName + "\n" +
               "Publisher: " + publisher;
    }
}

public class Main {
    public static void main(String[] args) {

        Book myBook = new Book("The Great Gatsby", "978-0743273565", "F. Scott Fitzgerald", "Scribner");
  
        System.out.println(myBook.getBookInfo());
        myBook.setBookName("The Great Gatsby (Updated Edition)");
        System.out.println("\nUpdated Book Information:");
        System.out.println(myBook.getBookInfo());
    }
}
