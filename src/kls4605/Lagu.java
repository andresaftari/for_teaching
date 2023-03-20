package kls4605;

public class Lagu {
    private String title;

    public Lagu(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    @Override
    public String toString() {
        return "\nLagu " + getTitle();
    }
}