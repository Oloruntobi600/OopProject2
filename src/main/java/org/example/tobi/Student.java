package org.example.tobi;

public class Student extends Person{
    private int id;
    private int grade;
    private int feesPaid;
    private int totalFees;

    public Student(String name, int age, int id, int grade) {
        super(name, age);
        this.id = id;
        this.grade = grade;
    }
}
