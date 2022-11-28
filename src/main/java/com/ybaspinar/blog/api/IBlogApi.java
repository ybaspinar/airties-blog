package com.ybaspinar.blog.api;

import com.ybaspinar.blog.business.dto.BlogDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface IBlogApi {
    ResponseEntity<List<BlogDto>> listAllBlogs();
    ResponseEntity<BlogDto> findBlog(Long id);
    ResponseEntity<?> addBlog(BlogDto blogDto);
    ResponseEntity<BlogDto> updateBlog(Long id);
    ResponseEntity<Map<String, Boolean>> deleteBlog(Long id);
}
