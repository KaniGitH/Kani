package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Jan4Class {

    /**
     * This method for calling start point of the program
     */
    public void mainCall() {

        System.out.println();
        System.out.println("Program 1 - Sum of n numbers");
        System.out.println("Program 2 - Reverse Array Element");
        System.out.println("Program 3 - Reverse String Value");
        System.out.println("Program 4 - Prime Number");
        System.out.println("Program 5 - Leap Year");
        System.out.println("Program 6 - Vowel");
        System.out.println("Program 7 - Reverse number");
        System.out.println("Program 8 - Insert elements into an array");
        System.out.println();
        System.out.println("The above programs are available by enter it's number ");
        System.out.println("Please enter the program number or to exit enter 0");

        Scanner getNumbers = new Scanner(System.in);
        int programNumber = getNumbers.nextInt();
        if (programNumber > 0 && programNumber < 9) {
            gotoProgram(programNumber);
        } else if (programNumber >= 9) {
            System.out.println("Please enter valid number");
        } else System.out.println("Exit done");
    }

    /**
     * This method for calling requested program
     *
     * @param programNumber - input contains program number
     */
    public void gotoProgram(int programNumber) {

        Scanner getNumbers = new Scanner(System.in);
        Scanner getChar = new Scanner(System.in);

        // Sum of n Numbers
        if (programNumber == 1) {
            System.out.println("Sum of n numbers");
            int nNumber = 0;
            System.out.println("Enter n value to Sum of n numbers ");
            nNumber = getNumbers.nextInt();

            int[] randomNumbers = new int[nNumber];
            System.out.println("Enter " + nNumber + " numbers you want to sum");
            for (int i = 0; i < nNumber; i++) {
                randomNumbers[i] = getNumbers.nextInt();
            }
            sumOfNnumbers(randomNumbers);
        }

        // Reverse Array Element
        if (programNumber == 2) {
            int nNumber = 0;
            System.out.println("Enter number of elements in array ");
            nNumber = getNumbers.nextInt();
            int[] randomNumbers = new int[nNumber];
            System.out.println("Enter " + nNumber + " numbers of the array");
            for (int i = 0; i < nNumber; i++) {
                randomNumbers[i] = getNumbers.nextInt();
            }
            reverseArrayElement(randomNumbers);
        }

        // Reverse String Value
        if (programNumber == 3) {
            System.out.println("Enter string value to be reverse ");
            reverseString(getChar.nextLine());
        }

        // Prime Number
        if (programNumber == 4) {
            System.out.println("Enter number to check prime number ");
            findPrimeNumbers(getNumbers.nextInt());
        }

        // Leap Year
        if (programNumber == 5) {
            System.out.println("Enter year to check leap year ");
            findLeapYear(getNumbers.nextInt());
        }

        // Vowel
        if (programNumber == 6) {
            System.out.println("Enter Character to check vowel ");
            findVowel(getChar.next().charAt(0));
        }

        // Reverse number
        if (programNumber == 7) {
            System.out.println("Enter numbers to reverse ");
            nreverseNumber = reverseNumber(getNumbers.nextInt());
            System.out.println("After Reverse the number as  " + nreverseNumber);
        }

        // Insert Elements to an Array
        if (programNumber == 8) {
            System.out.println("Insert elements in array");
            int nNumber = 0;
            System.out.println("Enter number of elements in array");
            nNumber = getNumbers.nextInt();

            int[] randomNumbers = new int[nNumber];
            System.out.println("Enter " + nNumber + " numbers you want in array");
            for (int i = 0; i < nNumber; i++) {
                randomNumbers[i] = getNumbers.nextInt();
            }
            System.out.println("Now your array is " + Arrays.toString(randomNumbers));

            System.out.println("Now enter your new value to array");
            int nNewValue = 0;
            nNewValue = getNumbers.nextInt();

            System.out.println("Now enter where to insert new value to array(position)");
            int nPosition = 0;
            nPosition = getNumbers.nextInt();

            insertElementsToArray(randomNumbers, nNewValue, nPosition);
        }
        mainCall();
    }

    /**
     * Thi method add all numbers in given array
     *
     * @param nNumbers is input to this method
     */
    public void sumOfNnumbers(int nNumbers[]) {
        // declare sum and assign 0;
        int sum = 0;
        // this loop pick each element(nNumber) in nNumbers
        for (int nNumber : nNumbers) {
            // add nNumber value and sum ,assign return value to sum
            sum += nNumber;
        }
        // To Print Sum value
        System.out.println("Sum of " + nNumbers.length + " numbers " + Arrays.toString((nNumbers)) + " is " + sum);
    }

    /**
     * This method reverse an element in an array
     *
     * @param nNumbers is an input contains value of array
     */
    public void reverseArrayElement(int[] nNumbers) {
        // declare tempNNumbers and initialize it's size
        int[] tempNNumbers = new int[nNumbers.length];
        // declare tempPosition and assign 0
        int tempPosition = 0;
        // for loop to get array value from last to first
        for (int i = nNumbers.length - 1; i >= 0; i--) {
            // assign last value to first in tempNNumbers
            tempNNumbers[tempPosition] = nNumbers[i];
            // increment tempPosition by 1
            tempPosition++;
        }
        // to print result of reversed array
        System.out.println("Reverse of array elements is " + Arrays.toString(tempNNumbers));

    }

    /**
     * Thiss method help to reverse string value
     *
     * @param givenStringValue input to this method contains string value
     */
    public void reverseString(String givenStringValue) {
        // declare splitofgivenString and initialize size to 100
        char[] splitofgivenString = new char[100];
        //declare position and assign 0
        int position = 0;
        // get string value as character in an array format, its assign to splitofgivenString
        splitofgivenString = givenStringValue.toCharArray();
        // declare tempSplitofgivenString and initialize size
        String tempSplitofgivenString = "";
        for (int i = splitofgivenString.length - 1; i >= 0; i--) {
            // assign splitofgivenString last value to first in tempSplitofgivenString
            tempSplitofgivenString += splitofgivenString[i];
            // increment position by 1
            position++;
        }
        // to print output
        System.out.println("After Reverse " + tempSplitofgivenString);
    }

    /**
     * This method find Prime Number
     *
     * @param numbers input to find prime number
     */
    public void findPrimeNumbers(int numbers) {
        // declare flag assign false
        boolean flag = false;
        // to check prime its divisiable by itself and by 1 only
        for (int i = 2; i <= numbers / 2; ++i) {
            // check its reminder is zero
            if (numbers % i == 0) {
                // assign flag value as true and break the loop
                flag = true;
                break;
            }
        }

        // the flag is false print as prime number or true print as not a prime number
        if (!flag)
            System.out.println(numbers + " is a prime number.");
        else
            System.out.println(numbers + " is not a prime number.");
    }

    /**
     * This method checks given year value is a leap year
     *
     * @param givenYear - input to this method contains year value
     */
    public void findLeapYear(int givenYear) {
        // declare leapYear and assign its value as false
        boolean leapYear = false;
        // declare flag and assign its value as 0
        int flag = 0;
        // check given year as 400 century
        if (givenYear % 400 == 0) {
            leapYear = true;
            flag = 1;
        }
        // check given year as 100 century
        if (givenYear % 100 == 0 && flag == 0) {
            leapYear = false;
            flag = 1;
        }
        // check given year divide by 4 and reminder as 0
        if (givenYear % 4 == 0 && flag == 0) {
            leapYear = true;
        }

        if (leapYear)
            System.out.println(givenYear + " is a leap year");
        else
            System.out.println(givenYear + " is not a leap year.");
    }

    /**
     * This method reverse the given Character value
     *
     * @param givenChar - input value to be reversed
     */
    public void findVowel(char givenChar) {
        // check it is a vowel and print result
        if (givenChar == 'a' || givenChar == 'e' || givenChar == 'i' || givenChar == 'o' || givenChar == 'u') {
            System.out.println("Given charecter " + givenChar + " is vowel");
        } else System.out.println("Given charecter " + givenChar + " is not vowel");
    }

    int nreverseNumber = 0;

    /**
     * This method reverse the given number
     *
     * @param givenNumber - input value to be reversed
     * @return return output value of the number
     */
    public int reverseNumber(int givenNumber) {
        if (givenNumber != 0) {
            int remainder = givenNumber % 10;
            nreverseNumber = (nreverseNumber * 10) + remainder;
            reverseNumber(givenNumber / 10);
        }
        return nreverseNumber;
    }

    /**
     * This method helps to insert elements in any one position of the array variable
     *
     * @param givenArray is an array variable of value
     * @param newValue   - which value going to insert into an array
     * @param position   - where to insert that means position of the object
     */
    public void insertElementsToArray(int[] givenArray, int newValue, int position) {
        // declare tempGivenArray and initialize its size
        int[] tempGivenArray = new int[givenArray.length + 1];
        // condition to check newvalue going to insert on last in an array
        if (position == givenArray.length + 1) {
            // to get each element from givenArray and assign to tempGivenArray
            for (int i = 0; i < givenArray.length; i++) {
                tempGivenArray[i] = givenArray[i];
            }
            // assign newvalue to tempGivenArray in its last element
            tempGivenArray[givenArray.length] = newValue;
        } else {
            // to get each element from givenArray upto before index(position) and assign to tempGivenArray
            for (int i = 0; i < position - 1; i++) {
                tempGivenArray[i] = givenArray[i];
            }
            // assign newvalue to tempGivenArray in its required position
            tempGivenArray[position - 1] = newValue;
            // to get each element from givenArray after index(position) and assign to tempGivenArray
            for (int i = position - 1; i < givenArray.length; i++) {
                tempGivenArray[i + 1] = givenArray[i];
            }
        }
        // to print Result array
        System.out.println("Now the array elements are " + Arrays.toString(tempGivenArray));
    }
}
