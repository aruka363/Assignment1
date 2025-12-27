package classes;

public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isActive;

    public Human(int age, String name, boolean isActive) {
        this.age = age;
        this.name = name;
        this.isActive = isActive;
    }

    public void info() {
        System.out.println("Name: " + name + ", Age: " + age + ", Active: " + isActive);
    }

    public abstract void work();
}