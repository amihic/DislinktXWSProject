package com.example.DislinktXWSProject.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.DislinktXWSProject.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, Long> {

}
