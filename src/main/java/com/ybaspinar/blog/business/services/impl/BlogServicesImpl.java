package com.ybaspinar.blog.business.services.impl;

import com.ybaspinar.blog.bean.ModelMapperBean;
import com.ybaspinar.blog.business.dto.BlogDto;
import com.ybaspinar.blog.business.services.IBlogService;
import com.ybaspinar.blog.data.entity.BlogEntity;
import com.ybaspinar.blog.data.repository.IBlogRepository;
import com.ybaspinar.blog.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@RequiredArgsConstructor
@Log4j2

@Service
@Transactional
public class BlogServicesImpl implements IBlogService {

    private final IBlogRepository blogRepository;
    private final ModelMapperBean modelMapperBean;


    @Override
    public BlogDto entityToDto(BlogEntity registerEntity) {
        return modelMapperBean.modelMapperMethod().map(registerEntity, BlogDto.class);
    }

    @Override
    public BlogEntity dtoToEntity(BlogDto registerDto) {
        return modelMapperBean.modelMapperMethod().map(registerDto, BlogEntity.class);
    }

    @Override
    public List<BlogDto> getAll() {
        List<BlogEntity> blogList = blogRepository.findAll();
        List<BlogDto> blogDtoList = new ArrayList<>();
        for (BlogEntity blog : blogList) {
            blogDtoList.add(entityToDto(blog));
        }
        return blogDtoList;
    }

    @Override
    public BlogDto getBlog(Long id) {
        BlogEntity blog = blogRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There's no resource with id:" + id));
        return entityToDto(blog);
    }

    @Override
    public BlogDto addBlog(BlogDto registerDto) {
        BlogEntity blog = dtoToEntity(registerDto);
        blogRepository.save(blog);
        return entityToDto(blog);
    }

    @Override
    public BlogDto updateBlog(Long id, BlogDto blogDto) {
        BlogEntity blog = blogRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There's no resource with id:" + id));
        if (blog != null) {
            blog.setBlogHeader(blogDto.getBlogHeader());
            blog.setBlogContent(blogDto.getBlogContent());
            blog.setBlogImage(blogDto.getBlogImage());
            blogRepository.save(blog);
        }
        return entityToDto(blog);
    }

    @Override
    public Map<String, Boolean> deleteBlog(Long id) {
        BlogEntity blog = blogRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("There's no resource with id:" + id));;
        blogRepository.delete(blog);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}


