package com.vilin.spring.integration.service.impl;

import com.vilin.spring.integration.dao.RoleDao;
import com.vilin.spring.integration.domain.Role;
import com.vilin.spring.integration.service.RoleService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertRole(Role role) {
        return roleDao.insertRole(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int updateRole(Role role) {
        return roleDao.updateRole(role);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteRole(Integer id) {
        return roleDao.deleteRole(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Role getRole(Integer id) {
        return roleDao.getRole(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public List<Role> findRoles(String roleName, int start, int limit) {
        return roleDao.findRoles(roleName, new RowBounds(start, limit));
    }
}
