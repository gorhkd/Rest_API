package com.ll.RestAPI.Service;

import com.ll.RestAPI.Model.Post;
import com.ll.RestAPI.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;

    public List<Post> postList() {
        return List.of(
                new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title2", "contents2", "", LocalDateTime.now()),
                new Post(UUID.randomUUID(), "title3", "contents3", "", LocalDateTime.now())
        );
    }

}
