package org.school;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TimeTableForGrade {

    private int timeTableForGradeId;
    private int gradeId;
    private String timeTableDay;
    private String period1;
    private String period2;
    private String period3;
    private String period4;

    private String period5;
    private String period6;
    private String period7;
    private String period8;
    private int classTeacherId;
}
