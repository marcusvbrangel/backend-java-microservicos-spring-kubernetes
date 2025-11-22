package com.ecommerce.userapi.repository;

import com.ecommerce.userapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByCpfAndKey(String cpf, String key);

    List<User> queryByNomeLike(String nome);

}
