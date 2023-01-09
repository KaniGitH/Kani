package org.example;

public class Student {

    String name;
    String sex;
    int age;
    float height;


    public org.example.Student setDetails(String name, int age, String sex, float height) {
        // System.out.println("Test");
        org.example.Student student = new org.example.Student();
        student.name = name;
        student.age = age;
        student.sex = sex;
        student.height = height;
        // System.out.println(name + " created");
        return student;

    }

    private String getStudentType(int studentAge) {

        if (studentAge > 65) {
            return "senior";
        } else if (studentAge > 12 && studentAge < 20) {
            return "teenager";
        } else {
            return "regular";
        }

    }

    public void printDetails(Student student) {

        String studentType = getStudentType(student.age);
        System.out.println(student.name + " is a " + studentType + " student and height is " + student.height);

    }

    public void findTaller(Student[] Students) {

        float tempTall = 0;
        Student student = new Student();

        for (int i = 0; i < Students.length; i++) {

            if (tempTall < Students[i].height) {
                tempTall = Students[i].height;
                student = Students[i];
            }
        }
        System.out.println(student.name + " is a Taller");

    }

}
