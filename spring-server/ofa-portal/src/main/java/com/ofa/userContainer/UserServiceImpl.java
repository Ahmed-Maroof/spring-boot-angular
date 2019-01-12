package com.ofa.userContainer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserRepository repository;
	
    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public Optional<User> delete(Long id) {
        Optional<User> user = findById(id);
        if(user != null){
            repository.deleteById(id);
        }
        return user;
    }

    @Override
    public List findAll() {
        return (List) repository.findAll();
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }
}
