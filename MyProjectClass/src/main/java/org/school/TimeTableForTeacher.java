package org.school;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TimeTableForTeacher {
    private int timeTableForTeacherId;
    private int teacherId;
    private String timeTableDay;
    private String period1SubjectId;
    private int period1GradeId;
    private String period2SubjectId;
    private int period2GradeId;
    private String period3SubjectId;
    private int period3GradeId;
    private String period4SubjectId;
    private int period4GradeId;

    private String period5SubjectId;
    private int period5GradeId;
    private String period6SubjectId;
    private int period6GradeId;
    private String period7SubjectId;
    private int period7GradeId;
    private String period8SubjectId;
    private int period8GradeId;
}
