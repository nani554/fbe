package com.factly_blog.blogs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factly_blog.blogs.bo.AuthorBo;
import com.factly_blog.blogs.dao.AuthorDao;
import com.factly_blog.blogs.service.AuthorService;
import com.factly_blog.blogs.vo.AuthorVo;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorDao authdao;
	
	@Override
	public AuthorBo newauthor(AuthorVo author) {
		System.out.println(author);
		AuthorBo authbo = authdao.findByMailId(author.getMailId());
		System.out.println(authbo);
		if(authbo == null) {
			AuthorBo authb = new AuthorBo();
			authb.setAuthorName(author.getAuthorName());
			authb.setMailId(author.getMailId());
			authb.setPassword(author.getPassword());
			authb.setConfirmPassword(author.getConfirmPassword());
			authb.setPhoneNumber(author.getPhoneNumber());
			return authdao.save(authb);
		}
		return null;
	}

	@Override
	public List<AuthorBo> getallauthors() {
		// TODO Auto-generated method stub
		return authdao.findAll();
	}

	@Override
	public AuthorBo getspecific(Long id) {
		return authdao.findById(id).orElse(null);
	}

	@Override
	public AuthorBo updateauthor(AuthorVo author, Long id) {
		AuthorBo authbo = authdao.findById(id).orElse(null);
		if(authbo != null) {
			authbo.setAuthorName(author.getAuthorName());
			authbo.setMailId(author.getMailId());
			authbo.setPassword(author.getPassword());
			authbo.setConfirmPassword(author.getConfirmPassword());
			authbo.setPhoneNumber(author.getPhoneNumber());
			return authdao.save(authbo);
		}
		return null;
	}

	@Override
	public void deleteauthor(Long id) {
		AuthorBo authbo = authdao.findById(id).orElse(null);
		if(authbo != null) {
			authdao.delete(authbo);	
		}
	}

}
