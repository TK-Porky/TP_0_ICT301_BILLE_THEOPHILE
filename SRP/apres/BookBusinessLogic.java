package ict301.solid.srp;

public class BookBusinessLogic {
    private String title;
    private String content;
    
    public void emprunter(String lecteur) {
        System.out.println("Emprunt du livre '" + title + "' par " + lecteur);
    }
}