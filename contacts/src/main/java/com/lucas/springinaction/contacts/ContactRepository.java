package com.lucas.springinaction.contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: liucaisi
 * @date: 2018/2/23
 */
@Repository
public class ContactRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Contact> findAll() {
        return jdbcTemplate.query("SELECT id, firstName, lastName, phoneNumber, emailAddress FROM contacts ORDER BY " +
                "lastName", (rs, rowNum) -> {
                    Contact contact = new Contact();
                    contact.setId(rs.getLong(1));
                    contact.setFirstName(rs.getString(2));
                    contact.setLastName(rs.getString(3));
                    contact.setPhoneNumber(rs.getString(4));
                    contact.setEmailAddress(rs.getString(5));
                    return contact;
                }
        );
    }

    public void save(Contact contact) {
        jdbcTemplate.update("INSERT INTO contacts(firstName, lastName, phoneNumber, emailAddress) values (?, ?, ?, " +
                "?)", contact.getFirstName(), contact.getLastName(), contact.getPhoneNumber(), contact.getEmailAddress());
    }

}
