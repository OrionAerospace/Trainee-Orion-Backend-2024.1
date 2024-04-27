package com.orion.trainee.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link com.orion.trainee.model.User}
 */
@Data
public class UserDto implements Serializable {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private List<BookDto> rentedBooks;
}