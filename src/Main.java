import java.util.Scanner;

class Human {
    protected int age;
    protected String name;
    protected boolean isActive;

    public Human(int age, String name, boolean isActive) {
        this.age = age;
        this.name = name;
        this.isActive = isActive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void info() {
        System.out.println("Name: " + name + ", Age: " + age + ", Active: " + isActive);
    }

    public void work() {
        System.out.println(name + " is working...");
    }
}

class Employee extends Human {
    private String department;
    private float salary;

    public Employee(int age, String name, boolean isActive, String department, float salary) {
        super(age, name, isActive);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is working in " + department + " department.");
    }
}

class Student extends Human {
    private String major;
    private float gpa;
    static int totalStudents = 0;

    public Student(int age, String name, boolean isActive, String major, float gpa) {
        super(age, name, isActive);
        this.major = major;
        this.gpa = gpa;
        totalStudents++;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    @Override
    public void work() {
        System.out.println(name + " is studying " + major + " with GPA: " + gpa);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Employee");
        Employee emp = new Employee(30, "John", true, "IT", 5000);
        emp.info();
        emp.work();
        System.out.println("\nStudent");

        System.out.print("Enter student name: ");
        String stName = sc.nextLine();
        System.out.print("Age: ");
        int stAge = sc.nextInt();
        System.out.print("Major: ");
        sc.nextLine();
        String major = sc.nextLine();
        System.out.print("GPA: ");
        float gpa = sc.nextFloat();

        Student student = new Student(stAge, stName, true, major, gpa);
        student.info();
        student.work();
        System.out.println("\nHuman");

        Human h = new Human(25, "Alice", true);
        h.info();
        h.work();

        System.out.println("\nUpdating Employee ann Student");
        emp.setSalary(6000);
        System.out.println("Employee salary update: " + emp.getSalary());

        student.setGpa(3.9f);
        System.out.println("Student gpa update: " + student.getGpa());

        System.out.println("\nTotal students: " + Student.getTotalStudents());

        sc.close();
    }
}