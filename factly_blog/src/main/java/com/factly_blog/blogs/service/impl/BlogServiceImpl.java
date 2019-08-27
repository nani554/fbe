package com.factly_blog.blogs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factly_blog.blogs.bo.AuthorBo;
import com.factly_blog.blogs.bo.BlogBo;
import com.factly_blog.blogs.dao.AuthorDao;
import com.factly_blog.blogs.dao.BlogDao;
import com.factly_blog.blogs.service.BlogService;
import com.factly_blog.blogs.vo.BlogVo;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogDao blogdao;
	
	@Autowired
	AuthorDao authordao;
	
	@Override
	public BlogBo newblog(BlogVo blog, Long id) {
		AuthorBo author = authordao.findById(id).orElse(null);
		
		System.out.println(blog);
		BlogBo blogs = new BlogBo();
		blogs.setDescription(blog.getDescription());
		blogs.setEmailId(blog.getEmailId());
		blogs.setRealauthor(author);
		System.out.println(blogs);
		return blogdao.save(blogs);
	}

	@Override
	public List<BlogBo> getallblogs() {
		return blogdao.findAll();
	}

	@Override
	public BlogBo getspecific(Long id) {
		return blogdao.findById(id).orElse(null);
	}

	@Override
	public BlogBo updateblog(BlogVo blog, Long id) {
		BlogBo blogbo = blogdao.findById(id).orElse(null);
		if(blogbo != null) {
			blogbo.setDescription(blog.getDescription());
			blogbo.setEmailId(blog.getEmailId());
			return blogdao.save(blogbo);
		}
		return null;
	}

	@Override
	public void deleteblog(Long id) {
		BlogBo blogbo = blogdao.findById(id).orElse(null);
		if(blogbo != null) {
			blogdao.delete(blogbo);	
		}
	}

}
