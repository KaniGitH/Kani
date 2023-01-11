package org.school;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TeacherSubject {
    private int teacherSubjectId;
    private int teacherId;
    private int subjectId;
}
