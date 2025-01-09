package com.ll.RestAPI.Model;

import lombok.Data;

import java.time.LocalDateTime;

@Data // getter, setter, toString 등 알아서 다 만들어준다.
public class Post {
    private String postId;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createDateTime;
}
