package com.ikernelback.ikernel.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "projects")
public class ProjectsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Projects", nullable = false)
    private Long id_projects;

    @Column(name = "NameProject", unique = true, nullable = false)
    private String nameProject;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "Developers", nullable = false)
    private String developers;

    @Column(name = "Phase", nullable = false)
    private String phase;

    @Column(name = "Leader", nullable = false)
    private String leader;

}

