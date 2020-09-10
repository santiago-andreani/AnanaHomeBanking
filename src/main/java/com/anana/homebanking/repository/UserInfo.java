package com.anana.homebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfo extends JpaRepository<UserInfo, Long> {
}
