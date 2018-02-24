package com.lucas.springinaction.contacts;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
@Getter
@Setter
public class Contact {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
}
