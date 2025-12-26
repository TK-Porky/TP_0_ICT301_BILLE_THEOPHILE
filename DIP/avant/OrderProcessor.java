package ict301.solid.dip;

public class OrderProcessor {
    private MySQLDatabase database;
    public OrderProcessor() {
        this.database = new MySQLDatabase();
    }
}