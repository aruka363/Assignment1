package classes;
import interfaces.IWork;
import interfaces.ILearn;

public class Employee extends Human implements IWork, ILearn {
    private String department;
    private float salary;

    public Employee(int age, String name, boolean isActive, String department, float salary) {
        super(age, name, isActive);
        this.department = department;
        this.salary = salary;
    }
    @Override
    public void work() { System.out.println(name + " works in " + department); }
    @Override
    public void performTask() { System.out.println(name + " is performing tasks."); }
    @Override
    public void attendMeeting() { System.out.println(name + " is in a meeting."); }
    @Override
    public void study() { System.out.println(name + " is learning new skills."); }
    @Override
    public void takeExam() { System.out.println(name + " is taking a certification exam."); }
    public void setSalary(float salary) { this.salary = salary; }
    public float getSalary() { return salary; }
}