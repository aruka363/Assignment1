import classes.*;
import interfaces.*;

import java.util.Scanner;

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