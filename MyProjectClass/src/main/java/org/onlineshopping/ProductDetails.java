package org.onlineshopping;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductDetails {

    private int productId;
    private String productName;
    private String productBrandName;
    private float productPrice;
    private float productWeight;
    private float productHeight;
    private float productLength;
    private float productBreath;
    private float productCategory;
    private int productQuantity;
    private String productSearchKey;

    private int vendorId;

}
