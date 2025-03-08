package com.bridgelabz.collections.levelone;

import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();

        Student s1 = new Student("Arnav", 101, 100);
        Student s2 = new Student("Kanika", 102, 100);
        Student s3 = new Student("Vibhor", 103, 90);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        for(Student st : arr){
            st.printDetails();
        }
    }
}

class Student {
    private String studentName;
    private int studentID;
    private int marks;

    Student(String studentName, int studentID, int marks){
        this.studentID = studentID;
        this.studentName = studentName;
        this.marks = marks;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getMarks() {
        return marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printDetails(){
        System.out.println("the name is " + this.studentName);
        System.out.println("the studentID is " + this.studentID);
        System.out.println("the marks are " + this.marks);

        System.out.println("--------------------------------");
    }

}
