package com.cydeo.task;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class Orange {
    private int weight;
    private Color color;
}

// @Builder generates an @AllArgsConstructor unless there is another @XConstructor
