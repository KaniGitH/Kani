package org.onlineshopping;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Customer {
    private int customerId;
    private String customerName;
    private String customerPassword;
    private String customerMobileNumber;
    private String customerMailId;
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private String customerCity;
    private String customerState;
    private String customerCountry;
}
