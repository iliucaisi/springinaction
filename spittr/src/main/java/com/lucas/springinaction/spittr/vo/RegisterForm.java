package com.lucas.springinaction.spittr.vo;

import com.lucas.springinaction.spittr.po.Spitter;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Getter
@Setter
public class RegisterForm {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String passwordConfirm;
    private String email;

    public Spitter toSpitter() {
        return new Spitter(null, username, password, firstName, lastName, email);
    }
}
