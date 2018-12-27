package com.cssl.service;

import com.cssl.pojo.Users;

public interface UsersService {

    //注册
    public int addUsers(Users users);

    //登录
    public Users login(Users users);

}
