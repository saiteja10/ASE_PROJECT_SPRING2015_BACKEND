package com.ase.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Created by Gurrala on 2/21/2015.
 */
@Entity
@Table(name = "user")
@PrimaryKeyJoinColumn(name = "id")
public class User extends Base {
    @Column(unique = true)
    private String userName;
    @Column(unique = true)
    private String email;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
