package week05;

import java.util.Inheritancee;

public class InheritanceeDemo {
    public static void main(String[] args) {

        Person person = new Person("John", "Doe", "Male");
        System.out.println(person);

        String[] courses = {"Math", "Science"};
        Teacher teacher = new Teacher("Jane", "Smith", "Female", "Math", courses);
        System.out.println(teacher);

        Student student = new Student("Alice", "Johnson", "Female", "Math");
    }

