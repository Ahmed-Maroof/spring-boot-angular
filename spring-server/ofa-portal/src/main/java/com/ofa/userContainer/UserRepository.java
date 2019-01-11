package com.ofa.userContainer;

import java.util.List;
import org.springframework.stereotype.Repository;

public interface UserRepository extends Repository{

	void delete(User user);

	List findAll();

	User findOne(int id);

	User save(User user);
}
