package ict301.solid.ocp;

class Rectangle implements Shape {
    private double width, height;
    public Rectangle(double w, double h) { this.width = w; this.height = h; }
    @Override public double calculateArea() { return width * height; }
}