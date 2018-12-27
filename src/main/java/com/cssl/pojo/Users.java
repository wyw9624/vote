package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Users {
    private Integer uid;
    private String uname;
    private String pwd;
    private Integer isAdmin;
}
