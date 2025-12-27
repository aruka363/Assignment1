package classes;
import interfaces.ILearn;

public final class Student extends Human implements ILearn {
    private String major;
    private float gpa;
    private static int students = 0;

    public Student(int age, String name, boolean isActive, String major, float gpa) {
        super(age, name, isActive);
        this.major = major;
        this.gpa = gpa;
        students++;
    }

    @Override public void work() { System.out.println(name + " studies " + major); }
    @Override public void study() { System.out.println(name + " is studying hard."); }
    @Override public void takeExam() { System.out.println(name + " is taking an exam in " + major); }
    public void showGpa() { System.out.println(name + "'s GPA: " + gpa); }
    public void setGpa(float gpa) { this.gpa = gpa; }
    public float getGpa() { return gpa; }
    public static int getTotalStudents() { return students;}
}