package org.onlineshopping;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerOrderDetails {
    private int customerOrderDetailsId;
    private int customerOrderId;
    private int productId;
    private int productQuantity;
    private double productPrice;
    private double totPrice;

}
