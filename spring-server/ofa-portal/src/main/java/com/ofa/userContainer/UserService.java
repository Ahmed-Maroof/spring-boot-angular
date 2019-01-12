package com.ofa.userContainer;

import java.util.List;
import java.util.Optional;

public interface UserService {

	public User create(User user);

	public Optional<User> delete(Long id);

	public List findAll();

	public Optional<User> findById(Long id);
}
