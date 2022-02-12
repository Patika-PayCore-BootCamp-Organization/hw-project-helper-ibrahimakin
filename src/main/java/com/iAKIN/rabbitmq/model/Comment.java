package com.iAKIN.rabbitmq.model;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment implements Serializable {

    private Integer id;

    private String comment;

    private Integer phraseId;

    private String type;

    private String lang;

    private LocalDate created;
}