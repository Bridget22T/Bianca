package main_package;

import student_package.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Hakim Ahmed", 25);
        s1.displayIfo();

        Lecturer lec=new Lecturer(" Jane",40);
        lec.displayIfo();
        }
    }

