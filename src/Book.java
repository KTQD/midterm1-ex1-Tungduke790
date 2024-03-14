public abstract class Book extends Item {
    String author;
    int numberOfPage;
    String genre;

    public Book(String name, String description, String id, float price, String author, int numberOfPage, String genre) {
        super(name, description, id, price);
        this.author = author;
        this.numberOfPage = numberOfPage;
        this.genre = genre;
    }
}
