package org.onlineshopping;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CustomerLoginDetails {

    private int customerId;
    private String loginDate;
    private String loginIntime;
    private String loginStatus;
    private String loginType;
}
