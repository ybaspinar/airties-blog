package com.ybaspinar.blog.dal.services;

import com.ybaspinar.blog.dal.repository.IBlogDal;
import com.ybaspinar.blog.data.entity.Blog;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HibernateBlogDal implements IBlogDal {

    private EntityManager entityManager;

    @Autowired
    public HibernateBlogDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Blog> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Blog> blogs = session.createQuery("from Blog", Blog.class).getResultList();
        return blogs;
    }

    @Override
    @Transactional
    public Void add(Blog blog) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(blog);
        return null;
    }

    @Override
    @Transactional
    public Void update(Blog blog) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(blog);
        return null;
    }

    @Override
    @Transactional
    public Void delete(Blog blog) {
        Session session = entityManager.unwrap(Session.class);
        Blog blogToDelete = session.get(Blog.class, blog.getId());
        session.delete(blogToDelete);
        return null;
    }
}
