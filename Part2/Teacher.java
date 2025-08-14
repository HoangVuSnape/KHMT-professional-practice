
package Part2; 
public class Teacher extends Person {
    private String subject;
    
    // Constructor mặc định
    public Teacher() {
        super();
    }
    
    // Constructor với tham số
    public Teacher(String name, String address, String subject) {
        super(name, address);
        this.subject = subject;
    }
    
    // Getter và Setter cho subject
    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}