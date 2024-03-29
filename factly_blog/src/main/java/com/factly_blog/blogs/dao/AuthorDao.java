package com.factly_blog.blogs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.factly_blog.blogs.bo.AuthorBo;

public interface AuthorDao extends JpaRepository<AuthorBo, Long> {
	@Query
	AuthorBo findByMailId(String mailId);
}
