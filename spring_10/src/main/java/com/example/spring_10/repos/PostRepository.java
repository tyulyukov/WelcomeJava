package com.example.spring_10.repos;

import com.example.spring_10.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PostRepository extends CrudRepository<Post, UUID> {
}
