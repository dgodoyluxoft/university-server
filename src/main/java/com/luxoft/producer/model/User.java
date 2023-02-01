package com.luxoft.producer.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
//public class User implements UserDetails {
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;

//    private boolean accountNonExpired;
//    private boolean accountNonLocked;
//    private boolean credentialsNonExpired;
//    private boolean enabled;

    public User() {
//        super();
    }

    public User(String name, String password) {
//        super();
        setName(name);
        setPassword(password);
//        setAccountNonExpired(true);
//        setAccountNonLocked(true);
//        setCredentialsNonExpired(true);
//        setEnabled(true);
    }

    public User(Long id, String name, String password) {
        setId(id);
        setName(name);
        setPassword(password);
//        setAccountNonExpired(true);
//        setAccountNonLocked(true);
//        setCredentialsNonExpired(true);
//        setEnabled(true);
    }

//    @Override
    public Set<String> getAuthorities() {
        return Set.of("AuthorityTest");
//        return List.of(new SimpleGrantedAuthority(getName()));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

//    public void setAccountNonExpired(boolean accountNonExpired) {
//        this.accountNonExpired = accountNonExpired;
//    }

//    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

//    public void setAccountNonLocked(boolean accountNonLocked) {
//        this.accountNonLocked = accountNonLocked;
//    }

//    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

//    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
//        this.credentialsNonExpired = credentialsNonExpired;
//    }

//    @Override
    public boolean isEnabled() {
        return false;
    }

//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }
}
