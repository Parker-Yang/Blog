package com.cdxy.blog.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ArticleUser implements Serializable {
    /**
     * art_id int,
     * u_id int,
     * art_time timestamp
     */
    private int art_id;
    private int u_id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date art_time;
}
