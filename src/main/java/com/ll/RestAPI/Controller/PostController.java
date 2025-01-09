package com.ll.RestAPI.Controller;

import com.ll.RestAPI.Model.Post;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @GetMapping("/list")
    public List<Post> postList() {
        return List.of(
                new Post("1", "title1", "contents1", "", LocalDateTime.now()),
                new Post("2", "title2", "contents2", "", LocalDateTime.now()),
                new Post("3", "title3", "contents3", "", LocalDateTime.now())
        );
    }

    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId) {
        return  new Post("1", "title1", "contents1", "", LocalDateTime.now());
    }

}
