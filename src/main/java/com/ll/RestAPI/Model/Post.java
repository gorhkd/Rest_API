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
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID postId;

    @Column(length = 100)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String contents;

    @Column
    private String author;

    private LocalDateTime createDateTime;
}
