package pl.clinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.clinic.model.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
