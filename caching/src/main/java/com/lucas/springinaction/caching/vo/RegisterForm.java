package com.lucas.springinaction.caching.vo;

import com.lucas.springinaction.caching.po.Spitter;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Getter
@Setter
public class RegisterForm {
    private String username;
    private String password;
    private String fullname;
    private String email;
    private Boolean updateByEmail;

    public Spitter toSpitter() {
        return new Spitter(null, username, password, fullname, email, true);
    }
}
