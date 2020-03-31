package me.potato.study.cqrs.crudsample.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Course {

    @Id
    @GeneratedValue
    private long   id;
    private String name;
    private int    credits;
}
