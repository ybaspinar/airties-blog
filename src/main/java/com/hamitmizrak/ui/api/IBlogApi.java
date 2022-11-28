package com.hamitmizrak.ui.api;

import com.google.gson.JsonElement;
import com.hamitmizrak.error.ApiResult;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IBlogApi {
    ApiResult saveBlog(JsonElement jsonElement);
    ResponseEntity<List<?>> listBlog();
    ResponseEntity<?> findBlog(Long id);
    ApiResult deleteBlog(Long id);
    ApiResult updateBlog(Long id,JsonElement jsonElement);
}
