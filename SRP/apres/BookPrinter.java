package ict301.solid.srp;

public class BookPrinter {
    private String title;
    private String author;
    private String content;

    public void printToScreen() {
        System.out.println("Titre: " + title);
        System.out.println("Auteur: " + author);
        System.out.println("Contenu: " + content);
    }
}