package com.cdxy.blog.entities;

import lombok.Data;

import javax.xml.soap.Text;
import java.io.Serializable;

@Data
public class Article implements Serializable {
    /**
     * art_id int primary key auto_increment,
     * title text,
     * describes text,
     * content text,
     * likes int,
     * visited int
     */
    private int art_id;
    private String title;
    private String describes;
    private String content;
    private int likes;
    private int visited;
    private String art_type;
}
