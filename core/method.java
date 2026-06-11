//Method Reference

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// A simple Student class to represent a student object
class Student {
    private String name;
    private int age;

    // Default constructor (no arguments)
    public Student() {
    }

    // Parameterized constructor — creates a Student with just a name
    public Student(String name) {
        this.name = name;
    }

    // toString() — defines how a Student object prints
    // Without this, println() would print a memory address like Student@1a2b3c
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class method {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin", "Harsh", "John");

        List<Student> students = new ArrayList<>();

        // Method 1: normal for-each loop
        // for (String name : names) {
        //     students.add(new Student(name));
        // }

        // Method 2: stream with lambda
        // students = names.stream()
        //                 .map(name -> new Student(name))
        //                 .toList();

        // Method 3: Method Reference (cleanest way)
        // Student::new is a constructor reference
        // It is shorthand for the lambda: name -> new Student(name)
        // Method references are used when a lambda just calls an existing method/constructor
        // Syntax: ClassName::methodName  or  ClassName::new  for constructors
        students = names.stream()
                        .map(Student::new)   // calls Student(String name) constructor for each name
                        .toList();

        System.out.println(students);
    }
}