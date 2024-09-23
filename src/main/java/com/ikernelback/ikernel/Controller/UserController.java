package com.ikernelback.ikernel.Controller;

import com.ikernelback.ikernel.Business.UserBusiness;
import com.ikernelback.ikernel.Dto.UserDto;
import com.ikernelback.ikernel.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {

    @Autowired
    private UserBusiness userBusiness;

    @GetMapping("/all")
    public List<UserDto> getAllUsers() {
        return userBusiness.findAll();
    }

    @PostMapping("/create")
    public void createUser(@RequestBody UserDto users) {
         userBusiness.create(users);
    }

    @PutMapping("/update/{ig}")
    public void updateUser(Long id , @RequestBody UserDto users) {
        userBusiness.update(id, users);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id")UserEntity entity) {
        userBusiness.delete(entity);
    }
}
