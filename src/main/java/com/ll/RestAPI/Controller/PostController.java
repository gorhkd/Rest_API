package com.ll.RestAPI.Controller;

import com.ll.RestAPI.Model.Post;
import com.ll.RestAPI.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @GetMapping("/list")
    public List<Post> postList() {
        return postService.postList();
    }

    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId) {
        return  new Post(UUID.randomUUID(), "title1", "contents1", "", LocalDateTime.now());
    }

}
