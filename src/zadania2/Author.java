package zadania2;

public class Author extends Person{
    private String pseudonym;

    public Author(int id, String firstName, String lastName, String pseudonym) {
        super(id, firstName, lastName);
        this.pseudonym = pseudonym;
    }
}
