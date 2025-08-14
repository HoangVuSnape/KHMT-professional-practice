package Part2_2;
public class TestShape {
    public static void main(String[] args) {
        // Tạo đối tượng Rectangle
        Rectangle rect = new Rectangle(5.0, 3.0);
        System.out.println(rect.toString());
        
        // Tạo đối tượng Triangle
        Triangle triangle = new Triangle(4.0, 6.0);
        System.out.println(triangle.toString());
        
        // Sử dụng interface Shape
        Shape[] shapes = {
            new Rectangle(10.0, 8.0),
            new Triangle(6.0, 4.0),
            new Rectangle(7.5, 2.5)
        };
        
        System.out.println("\nDanh sách các hình:");
        double totalArea = 0;
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            totalArea += shape.getArea();
        }
        
        System.out.println("\nTổng diện tích: " + totalArea);
    }
}
