package com.factly_blog.blogs.service;

import java.util.List;

import com.factly_blog.blogs.bo.BlogBo;
import com.factly_blog.blogs.vo.BlogVo;


public interface BlogService {

	public BlogBo newblog(BlogVo blog, Long id);
	
	public List<BlogBo> getallblogs();
	
	public BlogBo getspecific(Long id);
	
	public BlogBo updateblog(BlogVo blog, Long id);
	
	public void deleteblog(Long id);
}
