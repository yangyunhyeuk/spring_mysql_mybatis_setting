package com.yang.app.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Member {

    private Integer id;
    private String name;
    private String email;
    private String phone;
    private Date date;
}
