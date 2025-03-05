package com.bridgelabz.generics.levelone;

import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    String department;
    String course;

    public CourseType(String department, String course) {
        this.department = department;
        this.course = course;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String department, String course) {
        super(department, course);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String department, String course) {
        super(department, course);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String department, String course) {
        super(department, course);
    }
}

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    void addCourse(T course) {
        courses.add(course);
    }

    void displayCourses() {
        for (T course : courses) {
            System.out.println(course.course + " - " + course.department);
        }
    }

    static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.course + " - " + course.department);
        }
    }
}

public class MultiLevelUniversityCourseManagementSystem {
    public static void main(String[] args) {
        Course<ExamCourse> examCourseCatalog = new Course<>();
        Course<AssignmentCourse> assignmentCourseCatalog = new Course<>();
        Course<ResearchCourse> researchCourseCatalog = new Course<>();

        ExamCourse mathExam = new ExamCourse("Science", "Mathematics 101");
        AssignmentCourse csAssignment = new AssignmentCourse("Computer Science", "Data Structures");
        ResearchCourse physicsResearch = new ResearchCourse("Physics", "Quantum Physics");

        examCourseCatalog.addCourse(mathExam);
        assignmentCourseCatalog.addCourse(csAssignment);
        researchCourseCatalog.addCourse(physicsResearch);

        System.out.println("Individual Courses");
        examCourseCatalog.displayCourses();
        assignmentCourseCatalog.displayCourses();
        researchCourseCatalog.displayCourses();

        System.out.println("---------------------------------------");

        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(mathExam);
        allCourses.add(csAssignment);
        allCourses.add(physicsResearch);

        System.out.println("Displaying All Courses Using Wildcards");
        Course.displayAllCourses(allCourses);
    }
}

