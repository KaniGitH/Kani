package org.onlineshopping;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerCart {
    private int customerId;
    private int productId;
    private int quantity;

}
