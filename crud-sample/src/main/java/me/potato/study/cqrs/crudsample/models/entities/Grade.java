package me.potato.study.cqrs.crudsample.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Grade {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6);

    private int value;

}
