package com.ybaspinar.blog.api.impl;

import com.ybaspinar.blog.api.IBlogApi;
import com.ybaspinar.blog.business.dto.BlogDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Log4j2
@RequiredArgsConstructor

@RestController
@RequestMapping("/api/v1/blog")
@CrossOrigin
public class BlogApiImpl implements IBlogApi {

    @Override
    public ResponseEntity<List<BlogDto>> listAllBlogs() {
        return null;
    }

    @Override
    public ResponseEntity<BlogDto> findBlog(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> addBlog(BlogDto blogDto) {
        return null;
    }

    @Override
    public ResponseEntity<BlogDto> updateBlog(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, Boolean>> deleteBlog(Long id) {
        return null;
    }
}

