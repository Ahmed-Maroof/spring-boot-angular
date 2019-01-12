package com.ofa.userContainer;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//all the APIs related to user 

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)//allow Cross-Origin Resource Sharing (CORS) so that our angular application running on different server can consume these APIs from a browser.
@RestController
@RequestMapping({"/api"})
public class UserController {

	@Autowired
    private UserService userService;
	
	@PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public Optional<User> findOne(@PathVariable("id") Long id){
        return userService.findById(id);
    }

//    @PutMapping
//    public User update(@RequestBody User user){
//        return userService.update(user);
//    }

    @DeleteMapping(path = {"/delete/{id}"})
    public Optional<User> delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

    @GetMapping("/all")
    public List findAll(){
        return userService.findAll();
    }
}
