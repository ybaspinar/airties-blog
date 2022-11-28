package com.ybaspinar.blog.api.impl;

import com.ybaspinar.blog.api.IBlogApi;
import com.ybaspinar.blog.business.dto.BlogDto;
import com.ybaspinar.blog.business.services.IBlogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Log4j2
@RequiredArgsConstructor

@RestController
@RequestMapping("/api/v1/blog")
@CrossOrigin
public class BlogApiImpl implements IBlogApi {

    private final IBlogService blogService;

    @Override
    @GetMapping("/list")
    public ResponseEntity<List<BlogDto>> listAllBlogs() {
        return ResponseEntity.ok(blogService.getAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<BlogDto> findBlog(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(blogService.getBlog(id));
    }

    @Override
    @PostMapping("/add")
    public ResponseEntity<?> addBlog(@RequestBody BlogDto blogDto) {
        return ResponseEntity.ok(blogService.addBlog(blogDto));
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<BlogDto> updateBlog(@PathVariable(name = "id") Long id,@RequestBody BlogDto blogDto) {
        return ResponseEntity.ok(blogService.updateBlog(id,blogDto));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteBlog(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(blogService.deleteBlog(id));
    }
}

