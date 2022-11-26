package com.ybaspinar.blog.business;

import com.ybaspinar.blog.data.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    Blog get(Long id);
    Blog add(Blog blog);
    Blog update(Blog blog);
    Void delete(Long id);

}
