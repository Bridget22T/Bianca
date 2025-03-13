package main_package;

import student_package.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Mukiibi Nelly", 25);
        s1.displayIfo();

        Lecturer lec=new Lecturer("Kamoga Mike",40);
        lec.displayIfo();
        }
    }

