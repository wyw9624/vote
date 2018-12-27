package com.cssl.service.Impl;

import com.cssl.dao.UsersDao;
import com.cssl.pojo.Users;
import com.cssl.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao udao;

    @Override
    public int addUsers(Users users) {

        return 0;
    }

    @Override
    public Users login(Users users) {
        return null;
    }
}
