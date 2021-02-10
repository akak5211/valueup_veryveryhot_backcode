package com.valueup.veryveryhot.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Id;

import lombok.Getter;

@Getter
public class User {
    private final String name;
    private final String userid;
    private final String password;
    private final String birthdate;
    private final String emailaddress;
    private final String token;
    private List<Cross> cross;

    @Id
    private String id;

    public User(@JsonProperty("name") String name, @JsonProperty("userid") String userid,
            @JsonProperty("password") String password, @JsonProperty("birthdate") String birthdate,
            @JsonProperty("emailaddress") String emailaddress, @JsonProperty("token") String token,
            @JsonProperty("cross") List<Cross> cross) {
        this.name = name;
        this.userid = userid;
        this.password = password;
        this.birthdate = birthdate;
        this.emailaddress = emailaddress;
        this.token = token;
        this.cross = cross;
    }

}