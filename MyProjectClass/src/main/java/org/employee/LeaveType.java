package org.employee;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class LeaveType {

    private int LeaveId;
    private String LeaveName;
    private String LeaveShortName;
}
