package org.Travel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
