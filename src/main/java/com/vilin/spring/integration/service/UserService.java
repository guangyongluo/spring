package com.vilin.spring.integration.service;

import com.vilin.spring.integration.domain.User;

import java.util.List;

public interface UserService {
    public User getUser(Integer id);

    public int insertUser(User user);

    public int deleteUser(Integer id);

    public int updateUser(User user);

    public List<User> findUsers(String userName, int start, int limit);
}
