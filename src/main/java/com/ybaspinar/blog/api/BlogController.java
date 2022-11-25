package com.ybaspinar.blog.api;


import com.ybaspinar.blog.business.IBlogService;
import com.ybaspinar.blog.data.entity.Blog;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RequiredArgsConstructor

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class BlogController {


    private IBlogService blogService;

    @Autowired
    public BlogController(IBlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }

    @GetMapping("/blogs")
    public List<Blog> blogs() {
        return this.blogService.getAll();
    }




}
