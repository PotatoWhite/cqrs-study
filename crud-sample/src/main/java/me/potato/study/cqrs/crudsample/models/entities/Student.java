package me.potato.study.cqrs.crudsample.models.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private List<Enrollment>    enrollments    = new ArrayList<Enrollment>();
    private List<Disenrollment> disenrollments = new ArrayList<Disenrollment>();

    private Enrollment getEnrollment(int index) {
        if (enrollments.size() > index)
            return enrollments.get(index);

        return null;
    }

    public void removeEnrollment(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }

    public void addDisenrollmentComment(Enrollment enrollment, String comment) {
        Disenrollment disenrollment = new Disenrollment(
                enrollment.getStudent()
                , enrollment.getCourse()
        , comment);

        disenrollment.add(disenrollment);
    }

}
