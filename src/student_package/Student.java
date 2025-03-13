package student_package;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayIfo(){
        System.out.println("The name is: "+name);
        System.out.println("The age is: "+age);

    }
}
