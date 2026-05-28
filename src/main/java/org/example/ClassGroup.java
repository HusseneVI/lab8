package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class ClassGroup {

    private String name;
    private List<Student> students;

    public ClassGroup(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    //Nivel 1
    public void removeByEnrollments(int x) {
        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            Student student = it.next();

            if (student.getEnrollments() > x) {
                it.remove();
            }
        }
    }

    //Nivel 2
    public long countGrades(double value) {
        return students.stream()
                .filter(students -> students.getGrade() > value)
                .count();
    }

    public List<Student> sortByName() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }

    //Nivel 3
    public List<Student> top3() {
        return students.stream()
                .sorted(Comparator.comparing(Student::getGrade)).limit(3)
                .toList();
    }

    public double avgGrade() {
        return students.stream()
                .mapToDouble(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    //Nivel 4
    public boolean hasLowerGrade(double value) {
        return students.stream()
                .anyMatch(student -> student.getGrade() < value);
    }

    public boolean validNumbers() {
        return students.stream().allMatch(student -> student.getNumber() >= 10000
                && student.getNumber() <= 99999);
    }

    public List<String> namesNumberOfEnrolledments(int number) {
        return students.stream()
                .filter(s -> s.getEnrollments() == number)
                .map(n -> n.getName().toUpperCase())
                .sorted()
                .toList();

    }




    public void add(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "\nClassGroup{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}