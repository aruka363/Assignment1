import classes.*;
import interfaces.*;

import java.util.Scanner;

//class Human {
//    protected int age;
//    protected String name;
//    protected boolean isActive;
//
//    public Human(int age, String name, boolean isActive) {
//        this.age = age;
//        this.name = name;
//        this.isActive = isActive;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public boolean isActive() {
//        return isActive;
//    }
//
//    public void setActive(boolean active) {
//        isActive = active;
//    }
//
//    public void info() {
//        System.out.println("Name: " + name + ", Age: " + age + ", Active: " + isActive);
//    }
//
//    public void work() {
//        System.out.println(name + " is working...");
//    }
//}
//
//class Employee extends Human {
//    private String department;
//    private float salary;
//
//    public Employee(int age, String name, boolean isActive, String department, float salary) {
//        super(age, name, isActive);
//        this.department = department;
//        this.salary = salary;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public float getSalary() {
//        return salary;
//    }
//
//    public void setSalary(float salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public void work() {
//        System.out.println(name + " is working in " + department + " department.");
//    }
//}
//
//class Student extends Human {
//    private String major;
//    private float gpa;
//    static int totalStudents = 0;
//
//    public Student(int age, String name, boolean isActive, String major, float gpa) {
//        super(age, name, isActive);
//        this.major = major;
//        this.gpa = gpa;
//        totalStudents++;
//    }
//
//    public String getMajor() {
//        return major;
//    }
//
//    public void setMajor(String major) {
//        this.major = major;
//    }
//
//    public float getGpa() {
//        return gpa;
//    }
//
//    public void setGpa(float gpa) {
//        this.gpa = gpa;
//    }
//
//    public static int getTotalStudents() {
//        return totalStudents;
//    }
//
//    @Override
//    public void work() {
//        System.out.println(name + " is studying " + major + " with GPA: " + gpa);
//    }
//}

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

        System.out.println("\nUpdating Employee ann Student");
        emp.setSalary(6000);
        System.out.println("Employee salary update: " + emp.getSalary());

        student.setGpa(3.9f);
        System.out.println("Student gpa update: " + student.getGpa());

        System.out.println("\nTotal students: " + Student.getTotalStudents());

        Employee emp1 = new Employee(30, "John", true, "IT", 5000.0f);
        Student st1 = new Student(20, "Emma", true,  "CS", 3.8f);

        Human emp2 = new Employee(28, "Alice", true, "HR", 4500.0f);
        Human st2 = new Student(19, "Liam", true,  "Math", 3.5f);

        IWork emp3 = new Employee(35, "Bob", true, "Finance", 7000.0f);
        ILearn st3 = new Student(21, "Sophia", true,  "Physics", 3.9f);

        System.out.println("=== Employee (class reference) ===");
        emp1.info(); emp1.work(); emp1.performTask(); emp1.attendMeeting(); emp1.study(); emp1.takeExam();

        System.out.println("\n=== Employee (Human reference) ===");
        emp2.info(); emp2.work();

        System.out.println("\n=== Employee (Interface reference) ===");
        emp3.performTask(); emp3.attendMeeting();

        System.out.println("\n=== Student (class reference) ===");
        st1.info(); st1.work(); st1.study(); st1.takeExam(); st1.showGpa();

        System.out.println("\n=== Student (Human reference) ===");
        st2.info(); st2.work();

        System.out.println("\n=== Student (Interface reference) ===");
        st3.study(); st3.takeExam();

        sc.close();
    }
}