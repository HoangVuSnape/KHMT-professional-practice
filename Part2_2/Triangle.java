package Part2_2;
public class Triangle implements Shape {
    private double base;
    private double height;
    
    // Constructor mặc định
    public Triangle() {
        this.base = 0;
        this.height = 0;
    }
    
    // Constructor với tham số
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    // Getter và Setter cho base
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    // Getter và Setter cho height
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    // Implement phương thức getArea từ interface Shape
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + 
               ", area=" + getArea() + "]";
    }
}
