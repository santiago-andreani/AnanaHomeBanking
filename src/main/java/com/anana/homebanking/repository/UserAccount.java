package com.anana.homebanking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserAccount extends JpaRepository<UserAccount, UUID> {
}
