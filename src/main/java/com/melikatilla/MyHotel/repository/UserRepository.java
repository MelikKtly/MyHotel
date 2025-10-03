package com.melikatilla.MyHotel.repository;

import com.melikatilla.MyHotel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Boolean exsistsByEmail(String email) ;
    Optional<User> findByEmail(String email);
}
