package com.ybaspinar.blog.business;

import com.ybaspinar.blog.dal.IBlogDal;
import com.ybaspinar.blog.data.entity.Blog;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class BlogManager implements IBlogService {
    private IBlogDal blogDal;

    @Autowired
    public BlogManager(IBlogDal blogDal) {
        this.blogDal = blogDal;
    }

    @Override
    @Transactional
    public List<Blog> getAll() {
        return this.blogDal.getAll();
    }

    @Override
    @Transactional
    public Void add(Blog blog) {
        return this.blogDal.add(blog);
    }

    @Override
    @Transactional
    public Void update(Blog blog) {
        return this.blogDal.update(blog);
    }

    @Override
    @Transactional
    public Void delete(Blog blog) {
        return this.blogDal.delete(blog);
    }

}


