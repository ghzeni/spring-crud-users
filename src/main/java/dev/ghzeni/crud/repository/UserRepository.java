package dev.ghzeni.crud.repository;

import dev.ghzeni.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
