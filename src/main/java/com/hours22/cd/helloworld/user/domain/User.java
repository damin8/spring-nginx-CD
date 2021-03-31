package com.hours22.cd.helloworld.user.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String nickname;
}
