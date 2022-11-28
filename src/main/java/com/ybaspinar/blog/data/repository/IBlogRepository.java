package com.ybaspinar.blog.data.repository;

import com.ybaspinar.blog.data.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends JpaRepository<BlogEntity, Long> {
    BlogEntity findByBlogHeader(String blogHeader);
    BlogEntity findByBlogContent(String blogContent);
    BlogEntity findByBlogImage(String blogImage);

}