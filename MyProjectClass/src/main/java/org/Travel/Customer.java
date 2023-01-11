package org.Travel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
