package com.stackroute.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.domain.Blog;
import com.stackroute.repository.BlogRepository;


/* Add annotation to declare this class as Service class.
 * Also it should implement BlogService Interface and override all the implemented methods.*/

@Service
public class BlogServiceImpl implements BlogService {

	
	@Autowired
	private BlogRepository repo;
	
	@Override
	public Blog saveBlog(Blog blog) {
		// TODO Auto-generated method stub
		return repo.save(blog);
	}

	@Override
	public List<Blog> getAllBlogs() {
		// TODO Auto-generated method stub
		return (List<Blog>)repo.findAll();
	}

	@Override
	public Blog getBlogById(int id) {
		// TODO Auto-generated method stub
		Blog blog = repo.findById(id).get();
		return blog;
	}

	@Override
	public Blog deleteBlog(int id) {
		// TODO Auto-generated method stub
		Optional<Blog> get_blog = repo.findById(id);
		if(get_blog.isPresent())
		{
			repo.deleteById(id);
			return repo.findById(id).get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Blog updateBlog(Blog blog) {
		// TODO Auto-generated method stub
		Optional<Blog> get_blog = repo.findById(blog.getBlogId());
		if(get_blog.isPresent())
		{
			repo.save(blog);
			return repo.findById(blog.getBlogId()).get();
		}
		else
		{
			return null;
		}
	}
	
	

}
