package com.dxc.repository;

import com.dxc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

	User findByUsername(String username);

}
