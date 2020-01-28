package com.vilin.spring.integration.service.impl;

import com.vilin.spring.integration.dao.UserDao;
import com.vilin.spring.integration.domain.User;
import com.vilin.spring.integration.service.UserService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public User getUser(Integer id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteUser(Integer id) {
        return userDao.deleteUser(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<User> findUsers(String userName, int start, int limit) {
        return userDao.findUsers(userName, new RowBounds(start, limit));
    }
}
