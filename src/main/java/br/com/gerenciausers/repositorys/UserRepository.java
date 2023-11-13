package br.com.gerenciausers.repositorys;

import br.com.gerenciausers.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
