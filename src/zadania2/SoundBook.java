package zadania2;

public class SoundBook extends Book{
    private int duration;
    private int numberOfCarriers;
    public SoundBook(int id, String title, Author author, Author[] additionalAuthors, int duration, int numberOfCarriers) {
        super(id, title, author, additionalAuthors);
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }
}
