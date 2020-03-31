package me.potato.study.cqrs.crudsample.models.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.swing.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Enrollment {
    @Id
    @GeneratedValue
    private long    id;

    @NonNull
    private Student student;

    @NonNull
    private Course  course;

    @NonNull
    private Grade   grade;

    public void update(Course course, Grade grade){
        this.course = course;
        this.grade = grade;
    }


}
