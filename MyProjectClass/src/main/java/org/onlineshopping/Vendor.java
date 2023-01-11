package org.onlineshopping;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Vendor {
    private int vendorId;
    private String vendorName;
    private String vendorAddress;
    private String vendorMobileNumber;
    private String vendorBankAccount;


}
