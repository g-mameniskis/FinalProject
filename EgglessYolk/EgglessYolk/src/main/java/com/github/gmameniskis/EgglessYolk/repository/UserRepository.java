package com.github.gmameniskis.EgglessYolk.repository;

import com.github.gmameniskis.EgglessYolk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
//public interface UserRepository extends CrudRepository<User, UUID> {
public interface UserRepository extends JpaRepository<User, UUID> {

    List<User> findByUserName();
}
