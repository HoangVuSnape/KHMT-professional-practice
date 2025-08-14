package Part2_3;

public class Triangle extends Shape {
    private double base;
    private double height;
    
    // Constructor mặc định
    public Triangle() {
        super();
        this.base = 0;
        this.height = 0;
    }
    
    // Constructor với tham số
    public Triangle(double base, double height, String color) {
        super(color);
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
    
    // Override phương thức abstract getArea từ Shape
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    
    @Override
    public String toString() {
        return "Triangle [" + super.toString() + ", base=" + base + 
               ", height=" + height + ", area=" + getArea() + "]";
    }
}
