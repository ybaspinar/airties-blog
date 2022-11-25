package com.ybaspinar.blog.data.repository;

import com.ybaspinar.blog.data.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IBaseEntityRepository<T extends BaseEntity> extends JpaRepository<T, Long> {
    BaseEntity findByCreatedDate(String createdDate);
}