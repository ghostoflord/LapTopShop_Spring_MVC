package vn.teamwork.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.teamwork.laptopshop.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User ghost);

    void deleteById(long id);

    List<User> findOneByEmail(String email);

    List<User> findAll();

    User findById(long id); // null

    boolean existsByEmail(String email);

    User findByEmail(String email);
}
