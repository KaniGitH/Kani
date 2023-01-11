package org.employee;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeePayroll {

    private int employeeId;
    private String monthOfSalary;
    private String SalaryDate;
    private double empBasicPay;
    private double empHRA;
    private double empDA;
    private double empLTA;
    private double empPF;
    private double empESI;
    private double empAllowance;
    private double empNetPay;
    private double empGrossTotalSalary;
    private double empWorkingDays;
    private float totNumberOfWorkingDays;
}
