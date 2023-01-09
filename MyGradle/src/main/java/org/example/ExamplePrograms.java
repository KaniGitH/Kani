package org.example;

public class ExamplePrograms {


    // Print even numbers between 0 to 100
    public void printEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 2) == 0) {
                System.out.println(i + " is even number");
            }
        }
    }

    public void multipleOfSix() {
        for (int i = 1; i <= 100; i++) {
            // System.out.println(i + " X 6 = " + (i * 6));
            if (i % 6 == 0) {
                System.out.println(i);
            }

        }

    }

    public void findAverageMaxMin(int[] nNumbers) {

        // Average Value
        int totalValue = 0;
        System.out.println("Average of given numbers is ");
        for (int i = 0; i < nNumbers.length; i++) {
            totalValue += nNumbers[i];
        }
        System.out.print((double) (totalValue / nNumbers.length));
        System.out.println();

        // Maximum Number
        int maxNumber = 0;
        System.out.println("Maxcimum number of given numbers is ");
        for (int i = 0; i < nNumbers.length; i++) {
            if (nNumbers[i] > maxNumber) {
                maxNumber = nNumbers[i];
            }
        }
        System.out.print(maxNumber);
        System.out.println();

        // Minimum Number
        int minNumber = nNumbers[0];
        System.out.println("Minimum number of given numbers is ");
        for (int i = 1; i < nNumbers.length; i++) {
            if (nNumbers[i] < minNumber) {
              /*  if (minNumber == 0) {
                    minNumber = nNumbers[i];
                }*/
                minNumber = nNumbers[i];
            }
        }
        System.out.print(minNumber);
        System.out.println();
    }
}
