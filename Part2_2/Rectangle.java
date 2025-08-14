package Part2_2;
public class Rectangle implements Shape {
    private double length;
    private double width;
    
    // Constructor mặc định
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }
    
    // Constructor với tham số
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Getter và Setter cho length
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    // Getter và Setter cho width
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    // Implement phương thức getArea từ interface Shape
    @Override
    public double getArea() {
        return length * width;
    }
    
    // Phương thức tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + 
               ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
