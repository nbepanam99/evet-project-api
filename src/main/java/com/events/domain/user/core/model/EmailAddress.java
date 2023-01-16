package com.events.domain.user.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Embeddable
@EqualsAndHashCode
@ToString
public class EmailAddress {

    @Column(name="email")
    private String value;

    public EmailAddress(String value) {
        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        Matcher matcher = pattern.matcher(value);
        if(matcher.matches()){
            this.value = value;
        } else {
            throw new IllegalArgumentException("Provided value is not an email address");
        }
    }

    private EmailAddress(){}


}
