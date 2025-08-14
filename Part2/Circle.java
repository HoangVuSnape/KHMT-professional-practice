package Part2;
public class Circle {
    private double radius; 
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * 3.14;
    }
    
}
