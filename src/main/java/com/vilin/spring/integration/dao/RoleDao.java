package com.vilin.spring.integration.dao;

import com.vilin.spring.integration.domain.Role;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao {
    public int insertRole(Role role);

    public int updateRole(Role role);

    public int deleteRole(Integer id);

    public Role getRole(Integer id);

    public List<Role> findRoles(String roleName, RowBounds rowBounds);
}
