package org.employee;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmployeeLeave {

    private int employeeLeaveId;
    private int employeeId;
    private int leaveId;
    private float leaveDays;
    private String leaveRemarks;
    private String leaveRequestStatus;
    private String leaveFromDate;
    private String leaveToDate;
    private String leaveFromLeaveDay;

    LeaveType objLeaveType = new LeaveType();
}
