package org.wcci.blog.Storage.Repistories;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserStorageJpaImpl implements UserRepository {
    @Override
    public boolean authenticate(String username, String password) {
        // Provide a sample password check: username == password
        return Objects.equals(username, password);
    }
}