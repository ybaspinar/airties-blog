package com.ybaspinar.blog.business.services;

import com.ybaspinar.blog.business.dto.BlogDto;
import com.ybaspinar.blog.data.entity.BlogEntity;

import java.util.List;
import java.util.Map;

public interface IBlogService {
    BlogDto entityToDto(BlogEntity registerEntity);
    BlogEntity dtoToEntity(BlogDto registerDto);
    List<BlogDto> getAll();
    BlogDto getBlog(Long id);
    BlogDto addBlog(BlogDto registerDto);
    BlogDto updateBlog(Long id, BlogDto blogDto);
    Map<String,Boolean> deleteBlog(Long id);

}
