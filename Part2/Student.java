package Part2;
public class Student extends Person {
    private float scoreMath;
    private float scorePhysical;
    private float scoreChemistry;
    
    // Constructor mặc định
    public Student() {
        super();
    }
    
    // Constructor với tham số
    public Student(String name, String address, float scoreMath, float scorePhysical, float scoreChemistry) {
        super(name, address);
        this.scoreMath = scoreMath;
        this.scorePhysical = scorePhysical;
        this.scoreChemistry = scoreChemistry;
    }
    
    // Getter và Setter cho scoreMath
    public float getScoreMath() {
        return scoreMath;
    }
    
    public void setScoreMath(float scoreMath) {
        this.scoreMath = scoreMath;
    }
    
    // Getter và Setter cho scorePhysical
    public float getScorePhysical() {
        return scorePhysical;
    }
    
    public void setScorePhysical(float scorePhysical) {
        this.scorePhysical = scorePhysical;
    }
    
    // Getter và Setter cho scoreChemistry
    public float getScoreChemistry() {
        return scoreChemistry;
    }
    
    public void setScoreChemistry(float scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Math: " + scoreMath + 
               ", Physical: " + scorePhysical + ", Chemistry: " + scoreChemistry;
    }
}