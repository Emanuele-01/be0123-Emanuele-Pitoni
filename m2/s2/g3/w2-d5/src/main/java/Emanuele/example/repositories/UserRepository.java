package Emanuele.example.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Emanuele.example.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
	//Optional<User> findEmail(String email);
}
