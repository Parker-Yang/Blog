package com.cdxy.blog.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    /**
     *u_id int primary key auto_increment,
     * name varchar(20),
     * password varchar(20),
     * email varchar(20),
     * age int,
     * sign text,
     * gender varchar(5),
     * create_time timestamp,
     * identity int
     */
    private int u_id;
    private String name;
    private String password;
    private String email;
    private int age;
    private String sign;
    private String gender;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date create_time;
    private int identity;
}
