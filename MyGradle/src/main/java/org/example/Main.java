package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        /*Student student = new Student();
        Student anu = student.setDetails("Anu", 18, "female", 160);
        Student ram = student.setDetails("Ram", 60, "male", 150);
        Student janani = student.setDetails("Janani", 10, "female", 100);
        Student varun = student.setDetails("Varun", 45, "male", 166);
        Student mani = student.setDetails("Mani", 20, "male", 170);
        Student malar = student.setDetails("Malar", 45, "female", 165);

        Student[] students = {anu, ram, janani, varun, mani, malar};

        // find student type
        for (int i = 0; i < students.length; i++) {
            if (students[i].sex == "female" && students[i].age > 10) {
                student.printDetails(students[i]);
            }
        }

        // find taller
        student.findTaller(students); */

        // Even Numbers
        /*System.out.println();
        System.out.println("Even Numbers from 1 to 100");
        ExamplePrograms evenNumber = new ExamplePrograms();
        evenNumber.printEvenNumbers();*/

        // Multiple of Six
        /*System.out.println();
        System.out.println("Multiply of 6 upto 100");
        ExamplePrograms multipySix = new ExamplePrograms();
        multipySix.multipleOfSix();*/

        // Average, Maxcimum and Minimum Numbers
        Scanner getNumers = new Scanner(System.in);
        int[] randomNumbers = new int[10];
//        int randomNumberstest[] = new int[10];
        System.out.println("Enter Random of Ten Numbers ");
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = getNumers.nextInt();
        }

        System.out.println();
        System.out.println(Arrays.toString(randomNumbers));
        ExamplePrograms getAverageMaxMin = new ExamplePrograms();
        getAverageMaxMin.findAverageMaxMin(randomNumbers);

//        randomNumberstest = randomNumbers;
//        System.out.println(Arrays.toString(randomNumberstest));

    }

}



