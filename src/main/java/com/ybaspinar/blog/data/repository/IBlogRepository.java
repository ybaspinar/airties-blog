package com.ybaspinar.blog.data.repository;

import com.ybaspinar.blog.data.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<Blog, Long> {
    Blog findByBlogHeader(String blogHeader);
    Blog findByBlogContent(String blogContent);
    Blog findByBlogImage(String blogImage);

}