package Part2;

public class Person {
    protected String name;
    protected String address;
    
    // Constructor mặc định
    public Person() {
    }
    
    // Constructor với tham số
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.address = other.address;
    }
    
    // toString method
    public String toString() {
        return "Name: " + name + ", Address: " + address;
    }
    
    // Getter và Setter cho name
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter và Setter cho address
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}