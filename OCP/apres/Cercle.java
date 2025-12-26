package ict301.solid.ocp;

class Cercle implements Shape {
    private double radius;
    public Cercle(double r) { this.radius = r; }
    @Override public double calculateArea() { return Math.PI * radius * radius; }
}