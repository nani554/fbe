package com.factly_blog.blogs.service;

import java.util.List;

import com.factly_blog.blogs.bo.AuthorBo;
import com.factly_blog.blogs.vo.AuthorVo;

public interface AuthorService {
	public AuthorBo newauthor(AuthorVo author);
	
	public List<AuthorBo> getallauthors();
	
	public AuthorBo getspecific(Long id);
	
	public AuthorBo updateauthor(AuthorVo author, Long id);
	
	public void deleteauthor(Long id);
}
