package com.lucas.springinaction.jms.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
@Getter
@Setter
@AllArgsConstructor
public class Spitter {
    private Long id;
    private String username;
    private String password;
    private String fullname;
    private String email;
    private boolean updateByEmail;
}
