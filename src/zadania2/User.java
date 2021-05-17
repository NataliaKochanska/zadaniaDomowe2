package zadania2;

import java.util.Arrays;

public class User extends Person {
    private Book[] books;
    public User(int id, String firstName, String lastName, Book[] books) {
        super(id, firstName, lastName);
        this.books = new Book[0];
    }

    public void addBook(Book book) {
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length-1] = book;
    }

    public void returnBook(Book book){
        book.setAvailable(true);
        this.books = new Book[0];
    }


    public void returnAllBooks() {
        for (Book b : this.books) {
            book.setAvailable(true);
        }
    }
}
