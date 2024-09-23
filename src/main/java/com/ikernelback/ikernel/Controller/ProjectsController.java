package com.ikernelback.ikernel.Controller;

import com.ikernelback.ikernel.Business.ProjectsBusines;
import com.ikernelback.ikernel.Dto.ProjectsDto;
import com.ikernelback.ikernel.Entity.ProjectsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/projects")
public class ProjectsController {
@Autowired
    private ProjectsBusines projectsBusines;

@GetMapping("/all")
    public List<ProjectsDto> getAllProjects() {
    return projectsBusines.findAll();
}

@PostMapping("/create")
  public void createProject(@RequestBody ProjectsDto projectsDto) {
    projectsBusines.create(projectsDto);
}

@PutMapping("/update")
    public void updateProject(@RequestBody ProjectsDto projectsDto) {
    projectsBusines.update(projectsDto);
}

@DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable("id") ProjectsEntity Entity ) {
    projectsBusines.delete(Entity);
}
}
