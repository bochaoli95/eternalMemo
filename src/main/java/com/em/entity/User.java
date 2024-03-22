package com.em.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    private String email;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String nickName;
    private Date birthday;
    private Integer status;
    private Integer isDeleted;
}
