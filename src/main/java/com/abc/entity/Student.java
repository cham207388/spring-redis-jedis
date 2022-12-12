package com.abc.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Alhagie Bai Cham
 * {@code @date} 12/12/22
 */

@Data
public class Student implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
