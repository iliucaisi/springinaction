package com.lucas.springinaction.spittr.thymeleaf.po;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author: liucaisi
 * @date: 2017/12/4
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Spitter {
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "firstName", "lastName", "username", "password", "email");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "firstName", "lastName", "username", "password", "email");
    }
}
