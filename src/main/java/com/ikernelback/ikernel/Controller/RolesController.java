package com.ikernelback.ikernel.Controller;

import com.ikernelback.ikernel.Business.RolesBusiness;
import com.ikernelback.ikernel.Dto.RolesDto;
import com.ikernelback.ikernel.Entity.RolesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/roles")
public class RolesController {
    @Autowired
    private RolesBusiness rolesBusiness;

    @GetMapping("/all")
    public List<RolesDto> getAllUsers(){
        return rolesBusiness.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody RolesDto roles){
        rolesBusiness.create(roles);
    }

    @PutMapping("/update")
    public void update(@RequestBody RolesDto roles){
        rolesBusiness.update(roles);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") RolesEntity entity){
        rolesBusiness.delete(entity);
    }

}
