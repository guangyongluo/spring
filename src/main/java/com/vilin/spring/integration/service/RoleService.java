package com.vilin.spring.integration.service;

import com.vilin.spring.integration.domain.Role;

import java.util.List;

public interface RoleService {
    public int insertRole(Role role);

    public int updateRole(Role role);

    public int deleteRole(Integer id);

    public Role getRole(Integer id);

    public List<Role> findRoles(String roleName, int start, int limit);
}
