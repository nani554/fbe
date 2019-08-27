package com.factly_blog.blogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FactlyBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactlyBlogApplication.class, args);
	}

}
