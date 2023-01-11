package org.employee;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {

    private int employeeId;
    private String employeeRollId;
    private String employeeName;
    private String employeeDesignation;
    private String employeeDOB;
    private String employeeDOJ;
    private String employeeAddress;
    private String employeeMobileNumber;

    EmployeePayroll payroll = new EmployeePayroll();
}
