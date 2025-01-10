package com.ll.RestAPI;

import com.ll.RestAPI.Model.Post;
import com.ll.RestAPI.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
@RequiredArgsConstructor
public class RestApiApplication implements CommandLineRunner {

	private final PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Post> postList = List.of(
				new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now()),
				new Post(UUID.randomUUID(), "title2", "contents2", "", LocalDateTime.now()),
				new Post(UUID.randomUUID(), "title3", "contents3", "", LocalDateTime.now())
		);

		this.postRepository.saveAll(postList);
	}

}
