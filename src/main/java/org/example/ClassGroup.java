package org.example;

import java.util.ArrayList;
import java.util.List;

public class ClassGroup {

    private String name;
    private List<Student> students;

    public ClassGroup(String name) {
        this.name = name;
        this.students = new ArrayList<>();
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