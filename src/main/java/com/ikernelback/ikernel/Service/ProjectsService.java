package com.ikernelback.ikernel.Service;
import com.ikernelback.ikernel.Entity.ProjectsEntity;
import com.ikernelback.ikernel.Repository.ProjectsRepository;
import com.ikernelback.ikernel.Service.Dao.Idao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectsService implements Idao<ProjectsEntity, Long> {
    @Autowired
    private ProjectsRepository projectsRepository;


    @Override
    public List<ProjectsEntity> findAll() {
        return projectsRepository.findAll();
    }

    @Override
    public ProjectsEntity getById(Long id) {
        Optional<ProjectsEntity> optionalProjectsEntity = projectsRepository.findById(id);
        return optionalProjectsEntity.orElse(null);
    }

    @Override
    public void update(ProjectsEntity entity) {
       this.projectsRepository.save(entity);
    }

    @Override
    public void save(ProjectsEntity entity) {
       this.projectsRepository.save(entity);
    }

    @Override
    public void delete(ProjectsEntity entity) {
       this.projectsRepository.delete(entity);
    }

    @Override
    public void create(ProjectsEntity entity) {
       this.projectsRepository.save(entity);
    }

    @Override
    public void delete(Long id) {

    }
}
