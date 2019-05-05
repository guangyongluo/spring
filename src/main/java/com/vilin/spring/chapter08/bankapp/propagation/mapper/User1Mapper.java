package com.vilin.spring.chapter08.bankapp.propagation.mapper;

import com.vilin.spring.chapter08.bankapp.propagation.domain.User1;

public interface User1Mapper {
    int insert(User1 record);
    User1 selectByPrimaryKey(Integer id);
}
