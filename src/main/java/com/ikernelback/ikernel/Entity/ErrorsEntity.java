package com.ikernelback.ikernel.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Entity
@Setter
@Table(name = "Errors")
public class ErrorsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idErrors", nullable = false)
    private Long idErrors;

    @Column(name = "nameError", nullable = false)
    private String nameError;

    @Column(name = "Details", nullable = false)
    private String details;

    @Column(name = "Time", nullable = false)
    private String time;

    @Column(name = "IdProject", nullable = false)
    private Long idProject;

    @Column(name = "DocumentUser", nullable = false)
    private Long documentUser;
}
