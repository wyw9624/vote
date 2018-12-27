package com.cssl.dao;

import com.cssl.pojo.Users;

public interface UsersDao {

    //添加用户
    public int addUsers(Users users);

    //查询用户（uname）
    public Users selUsersByUname(Users users);
}
