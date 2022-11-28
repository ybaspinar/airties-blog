package com.ybaspinar.blog.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BlogDto implements Serializable {
     private Long id;
    private Date createdDate;

    private String blogHeader;

    private String blogContent;

    private String blogImage;
}
