package com.factly_blog.blogs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.factly_blog.blogs.bo.BlogBo;

public interface BlogDao extends JpaRepository<BlogBo, Long> {

}
