// Rawan Abdulkareem, 1806645, GBR 
//DON'T MAKE ANY CHANGE IN THIS FILE.

public class Tapes extends Materials {

    private int year;

    // Book full-arg constructor
    Tapes(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable(){
        return available;
    }
    
    public void borrow() { 
        available = false;
    }

    public String toString() {
        return " Title: " + getTitle() + " Year: " + getYear();
    }

}
