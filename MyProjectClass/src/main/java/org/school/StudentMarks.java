package org.school;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentMarks {
    private int studentId;
    private int examId;
    private int sub1Mark;
    private int sub2Mark;
    private int sub3Mark;
    private int sub4Mark;
    private int sub5Mark;
    private int totalMark;
    private boolean passStatus;

}
