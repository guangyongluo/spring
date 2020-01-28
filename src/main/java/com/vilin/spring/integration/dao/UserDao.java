package com.vilin.spring.integration.dao;

import com.vilin.spring.integration.domain.User;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    public User getUser(Integer id);

    public int insertUser(User user);

    public int deleteUser(Integer id);

    public int updateUser(User user);

    public List<User> findUsers(String useName, RowBounds rowBounds);
}
