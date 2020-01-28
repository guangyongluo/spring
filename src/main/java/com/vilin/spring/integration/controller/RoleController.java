package com.vilin.spring.integration.controller;

import com.vilin.spring.integration.domain.Role;
import com.vilin.spring.integration.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/role/getRole")
    @ResponseBody
    public Role getRole(@RequestParam("id") int id){
        long start = System.currentTimeMillis();
        Role role = roleService.getRole(id);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return role;
    }

}
