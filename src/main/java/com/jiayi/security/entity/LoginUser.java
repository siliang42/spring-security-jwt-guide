package com.jiayi.security.entity;

import lombok.Data;


/**
 * @author jiayi
 */
@Data
public class LoginUser {

    private String username;
    private String password;
    private Boolean rememberMe;
}
