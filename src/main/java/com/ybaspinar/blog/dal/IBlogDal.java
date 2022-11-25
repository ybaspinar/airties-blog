package com.ybaspinar.blog.dal;

import com.ybaspinar.blog.data.entity.Blog;

import java.util.List;

public interface IBlogDal {

    List<Blog> getAll();

    Void add(Blog blog);

    Void update(Blog blog);

    Void delete(Blog blog);

}
