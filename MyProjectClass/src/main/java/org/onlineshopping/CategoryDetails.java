package org.onlineshopping;

import lombok.*;

//@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CategoryDetails {
    private int categoryId;
    private String categoryName;
    private String categoryDetail;

    public CategoryDetails(int categoryId, String categoryName, String categoryDetail) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDetail = categoryDetail;
        System.out.println(this.categoryId + " " + this.categoryName + " " + this.categoryDetail);
    }
}
