package zadania2;

public class Book {
    private int id;
    private String title;
    private boolean available = true;
    private zadania.domowe.konstruktory.Author author;
    private zadania.domowe.konstruktory.Author[] additionalAuthors;
    private int popularity;


    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(int id, String title, zadania.domowe.konstruktory.Author author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book(int id, String title, zadania.domowe.konstruktory.Author author, Author[] additionalAuthors) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public Author getAuthor() {
        return author;
    }

    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors) {
        this.additionalAuthors = additionalAuthors;
    }

    public int bookPopularity(int popularity) {
        this.popularity = popularity;
        popularity++;
    }


    public boolean equals(Book book) {
        if (book.id == this.id) {
            return true;
        } else {
            return false;
        }
}
