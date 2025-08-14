package Part2_3;
public class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor mặc định
    public Rectangle() {
        super();
        this.length = 0;
        this.width = 0;
    }
    
    // Constructor với tham số
    public Rectangle(double length, double width, String color) {
        super(color);
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
    
    // Override phương thức abstract getArea từ Shape
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
        return "Rectangle [" + super.toString() + ", length=" + length + 
               ", width=" + width + ", area=" + getArea() + 
               ", perimeter=" + getPerimeter() + "]";
    }
}
