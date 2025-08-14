package Part2_3;
public class TestShape {
    public static void main(String[] args) {
        // Tạo đối tượng Rectangle với màu sắc
        Rectangle rect1 = new Rectangle(5.0, 3.0, "red");
        Rectangle rect2 = new Rectangle(8.0, 6.0, "blue");
        
        // Tạo đối tượng Triangle với màu sắc
        Triangle triangle1 = new Triangle(4.0, 6.0, "green");
        Triangle triangle2 = new Triangle(7.0, 3.0, "yellow");
        
        // In thông tin các hình
        System.out.println(rect1.toString());
        System.out.println(rect2.toString());
        System.out.println(triangle1.toString());
        System.out.println(triangle2.toString());
        
        // Sử dụng abstract class Shape
        Shape[] shapes = {
            new Rectangle(10.0, 8.0, "purple"),
            new Triangle(6.0, 4.0, "orange"),
            new Rectangle(7.5, 2.5, "pink"),
            new Triangle(5.5, 8.0, "cyan")
        };
        
        System.out.println("\n=== DANH SÁCH CÁC HÌNH ===");
        double totalArea = 0;
        
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            totalArea += shape.getArea();
        }
        
        System.out.println("\nTổng diện tích tất cả các hình: " + totalArea);
        
        // Test thay đổi màu sắc
        System.out.println("\n=== TEST THAY ĐỔI MÀU SẮC ===");
        shapes[0].setColor("black");
        System.out.println("Sau khi đổi màu: " + shapes[0].toString());
    }
}
