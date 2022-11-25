package com.ybaspinar.blog.business;

import com.ybaspinar.blog.data.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getAll();
    Void add(Blog blog);
    Void update(Blog blog);
    Void delete(Blog blog);

}
