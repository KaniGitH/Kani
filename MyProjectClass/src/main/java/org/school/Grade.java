package org.school;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Grade {
    private int gradeId;
    private String gradeName;
    private String gradeSection;
    private String academicYear;

}
