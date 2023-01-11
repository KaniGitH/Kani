package org.onlineshopping;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerOrder {

    private int customerOrderId;
    private int customerId;
    private String orderDate;
    private double billAmount;
    private String isPaid;
}
