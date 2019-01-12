package com.ofa.userContainer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//	void delete(User user);
//
//	List findAll();
//
//	User findOne(int id);
//
//	User save(User user);
}
