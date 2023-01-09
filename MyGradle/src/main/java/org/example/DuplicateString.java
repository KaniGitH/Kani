package org.example;

import java.util.Arrays;

public class DuplicateString {
    public static void main(String[] args) {

        String givenString = "How are you?, how do you have?";
        System.out.println(givenString);
        String[] splitString = givenString.split(" ");
        String[] tempSplitString = splitString;
        System.out.println(Arrays.toString(splitString));

        for (int i = 0; i < splitString.length; i++) {
            int nCount = 0;
            for (int j = 0; j < tempSplitString.length; j++) {
                if (splitString[i].equalsIgnoreCase(tempSplitString[j])) {
                    nCount++;
                    if (nCount > 1) {
                        tempSplitString[j] = "";
                    }
                }
            }
        }
        System.out.println(Arrays.toString(tempSplitString));
        for (int i = 0; i < tempSplitString.length; i++) {
            System.out.print(tempSplitString[i] + " ");

        }
    }
}
