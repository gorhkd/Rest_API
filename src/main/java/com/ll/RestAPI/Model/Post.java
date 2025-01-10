package com.ll.RestAPI.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data // getter, setter, toString 등 알아서 다 만들어준다.
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Post {
    @Id
    private UUID postId;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createDateTime;
}
