package com.lucas.springinaction.spittr.thymeleaf.vo;

import com.lucas.springinaction.spittr.thymeleaf.po.Spitter;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Getter
@Setter
public class RegisterForm {
    @NotNull
    @Size(min = 2, max = 30, message = "{firstName.size}")
    private String firstName;
    @NotNull
    @Size(min = 2, max = 30, message = "{lastName.size}")
    private String lastName;
    @NotNull
    @Size(min = 5, max = 16, message = "{username.size}")
    private String username;
    @NotNull
    @Size(min = 5, max = 25, message = "{password.size}")
    private String password;
    @NotNull
    @Size(min = 5, max = 25, message = "{password.size}")
    private String passwordConfirm;
    @NotNull
    @Email
    private String email;

    public Spitter toSpitter() {
        return new Spitter(null, username, password, firstName, lastName, email);
    }
}
