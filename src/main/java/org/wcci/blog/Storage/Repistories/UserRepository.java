package org.wcci.blog.Storage.Repistories;

public interface UserRepository {
    boolean authenticate(String username, String password);
}