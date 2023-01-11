package org.onlineshopping;

import java.util.Scanner;

public class CategoryEntry {

    public static void main(String[] args) {
        System.out.println("Category Details ");
        System.out.println();


        Scanner getScanner = new Scanner(System.in);

        System.out.println("Enter Category Id");
        int id = (Integer.parseInt(getScanner.nextLine()));
        System.out.println();
        System.out.println("Enter Category Name");
        String categoryName = getScanner.nextLine();
        System.out.println();
        System.out.println("Enter Category Detail");
        String categoryDetail = getScanner.nextLine();

//        objCategory.setCategoryId(id);
//        objCategory.setCategoryName(categoryName);
//        objCategory.setCategoryDetail(categoryDetail);

        CategoryDetails objCategory = new CategoryDetails(id, categoryName, categoryDetail);
        System.out.println("Category Id  / Category Name / Category Detail");
        System.out.println(objCategory.getCategoryId() + " / " + objCategory.getCategoryName() + " / " + objCategory.getCategoryDetail());
    }
}
