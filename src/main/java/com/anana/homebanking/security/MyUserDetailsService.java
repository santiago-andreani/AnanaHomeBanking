package com.anana.homebanking.security;

import com.anana.homebanking.entity.UserDetailsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final com.anana.homebanking.repository.UserDetailsRepository userRepository;

    @Autowired
    public MyUserDetailsService(com.anana.homebanking.repository.UserDetailsRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public MyUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<UserDetailsEntity> userDetailsEntity = userRepository.findByUsername(username);
        userDetailsEntity.orElseThrow(() -> new UsernameNotFoundException(username + " NOT FOUND"));

        return userDetailsEntity.map(MyUserDetails::new).get();
    }
}
