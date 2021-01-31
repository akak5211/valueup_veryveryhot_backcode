package com.valueup.veryveryhot.Model;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;


public class User {
    private final String name;
    private final String userid;
    private final String password;
    private final String birthdate;
    private final String emailaddress;
    private final String token;
    
    @Id
    private String id;

    public User(@JsonProperty("name") String name, @JsonProperty("userid") String userid, 
    @JsonProperty("password") String password, @JsonProperty("birthdate") String birthdate,
    @JsonProperty("emailaddress") String emailaddress, @JsonProperty("token") String token){
        this.name = name;
        this.userid = userid;
        this.password = password;
        this.birthdate = birthdate;
        this.emailaddress = emailaddress;
        this.token = token;
    }

    public String getName() {
        return this.name;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getPassword() {
        return this.password;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public String getEmailaddress() {
        return this.emailaddress;
    }

    public String getId() {
        return this.id;
    }

    public String getToken() {
        return this.token;
    }
    
}
