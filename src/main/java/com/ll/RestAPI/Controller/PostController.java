package com.ll.RestAPI.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    @GetMapping("/list")
    public String postList() {
        return "블로그 목록입니다.";
    }

    @GetMapping("/{postId}")
    public String postDetail(@PathVariable String postId) {
        return postId + "블로그 상세 내용입니다.";
    }

    @GetMapping("/update")
    public String updatePost(@RequestParam String postId){
        return postId + "블로그 수정페이지 입니다.";
    }
}
