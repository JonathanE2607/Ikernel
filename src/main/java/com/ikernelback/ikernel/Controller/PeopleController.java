package com.ikernelback.ikernel.Controller;

import com.ikernelback.ikernel.Business.PeopleBusiness;
import com.ikernelback.ikernel.Dto.PeopleDto;
import com.ikernelback.ikernel.Entity.PeopleEntity;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:5173")
@RestController
@RequestMapping(path = "api/v1/people")
public class PeopleController {

    @Autowired
    private PeopleBusiness peopleBusiness;

    @GetMapping("/all")
    public List<PeopleDto> getAllPeople(){
        return peopleBusiness.findAll();
    }

    @PostMapping("/create")
    public void createPeople(@RequestBody PeopleDto people){
        peopleBusiness.create(people);
    }

    @PutMapping("/update/{id}")
    public void updatePeople(Long id,@RequestBody PeopleDto people){
        peopleBusiness.update(id, people);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePeople(@PathVariable("id") PeopleEntity entity){
        peopleBusiness.delete(entity);
    }


}
