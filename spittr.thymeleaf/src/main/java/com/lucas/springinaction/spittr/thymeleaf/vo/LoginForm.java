package com.lucas.springinaction.spittr.thymeleaf.vo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author: liucaisi
 * @date: 2018/2/9
 */
@Getter
@Setter
public class LoginForm {
    @NotNull
    @Size(min = 5, max = 16, message = "{username.size}")
    private String username;
    @NotNull
    @Size(min = 5, max = 25, message = "{password.size}")
    private String password;
    private Boolean rememberMe;
}
