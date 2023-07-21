public class Book {

    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private String pubDate;

    public Book(String title, String author, String ISBN, String genre, String pubDate) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

}
