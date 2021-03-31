package com.hours22.cd.helloworld.user.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void 사용자_넣기(){
        User user = new User("favian");
        userRepository.save(user);

        List<User> users = userRepository.findAll();
        assertThat(users.get(0)).isEqualTo(user);
    }
}