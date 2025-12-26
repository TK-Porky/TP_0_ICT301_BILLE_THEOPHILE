package ict301.solid.srp;

public class BookSaver {
    private String title;
    
    public void saveToDatabase() {
        System.out.println("Sauvegarde du livre '" + title + "' en BD...");
    }
}