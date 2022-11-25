package com.ybaspinar.blog.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


@Entity
@Table(name = "blog")
public class Blog extends BaseEntity {

    @Serial
    private static final long serialVersionUID = -6115171257332161771L;
    //Blogs are entities that extend the BaseEntity class
            @Column(name = "header", nullable = false)
            private String blogHeader;


            private String blogContent;
            private String blogImage;

}