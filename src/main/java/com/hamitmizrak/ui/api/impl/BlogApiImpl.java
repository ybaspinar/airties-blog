package com.hamitmizrak.ui.api.impl;

import com.google.gson.JsonElement;
import com.hamitmizrak.business.services.IBlogService;
import com.hamitmizrak.error.ApiResult;
import com.hamitmizrak.ui.api.IBlogApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor

@RestController
@RequestMapping("gateway/blog")
public class BlogApiImpl implements IBlogApi {
    private final IBlogService iBlogService;
    private static final String PATH = "gateway/blog";

    @Override
    @PostMapping
    public ApiResult saveBlog(@RequestBody JsonElement jsonElement) {
        iBlogService.blogSave(jsonElement);
        return new ApiResult(200, "Blog saved", PATH);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<?>> listBlog() {
        iBlogService.blogList();
        return ResponseEntity.ok(iBlogService.blogList());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<?> findBlog(@PathVariable(name="id") Long id) {
        return ResponseEntity.ok(iBlogService.blogFind(id));
    }

    @Override
    @DeleteMapping
    public ApiResult deleteBlog(@PathVariable(name="id") Long id) {
        iBlogService.blogDelete(id);
        return new ApiResult(200, "Blog deleted", PATH);
    }

    @Override
    @PutMapping
    public ApiResult updateBlog(@PathVariable(name="id") Long id, @RequestBody JsonElement jsonElement) {
        iBlogService.blogUpdate(id, jsonElement);
        return new ApiResult(200, "Blog updated", PATH);
    }
}
