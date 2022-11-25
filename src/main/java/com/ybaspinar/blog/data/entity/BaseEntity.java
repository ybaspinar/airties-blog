package com.ybaspinar.blog.data.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
abstract public class BaseEntity implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "created_date", nullable = false, updatable = false)
        @CreatedDate
        private Date createdDate;

}
