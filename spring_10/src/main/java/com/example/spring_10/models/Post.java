package com.example.spring_10.models;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Table(name = "posts")
public class Post {
    @Id
    private UUID id = UUID.randomUUID();
    private String title;
    private String body;
    private String attachmentUrl;
}
