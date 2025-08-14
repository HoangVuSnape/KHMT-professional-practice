package Part2_3;
public abstract class Shape {
    protected String color;
    
    // Constructor mặc định
    public Shape() {
        this.color = "white";
    }
    
    // Constructor với tham số
    public Shape(String color) {
        this.color = color;
    }
    
    // Getter và Setter cho color
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Phương thức abstract - phải được override bởi lớp con
    public abstract double getArea();
    
    @Override
    public String toString() {
        return "Color: " + color;
    }
}
