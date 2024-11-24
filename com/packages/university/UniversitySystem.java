package com.packages.university;

import com.packages.university.students.Student;
import com.packages.university.courses.Course;
import com.packages.university.faculty.Faculty;

public class UniversitySystem {
    public static void main(String[] args) {
        Student student = new Student("Tamil", 101, "Computer Science");
        Course course = new Course("Data Structures", "CS201", 4);
        Faculty faculty = new Faculty("Guna", 1001, "Computer Science");

        System.out.println();
        System.out.println(student);
        System.out.println();
        System.out.println(course);
        System.out.println();
        System.out.println(faculty);
    }
}
