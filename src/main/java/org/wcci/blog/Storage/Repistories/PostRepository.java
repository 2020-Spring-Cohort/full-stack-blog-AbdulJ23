package org.wcci.blog.Storage.Repistories;


import org.wcci.blog.Models.Post;

import java.util.List;

public interface PostRepository {
    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}