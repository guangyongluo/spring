package com.vilin.spring.chapter08.bankapp.propagation.mapper;

import com.vilin.spring.chapter08.bankapp.propagation.domain.User2;

public interface User2Mapper {
    int insert(User2 record);
    User2 selectByPrimaryKey(Integer id);
}
