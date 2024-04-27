package com.orion.trainee.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookDto implements Serializable {
    private Long id;
    private String title;
    private String description;
    private String author;
}
