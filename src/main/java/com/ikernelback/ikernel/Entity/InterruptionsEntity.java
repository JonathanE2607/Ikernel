package com.ikernelback.ikernel.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Table(name = "interruptions")
@Entity
public class InterruptionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdInterruptions", nullable = false)
    private Long id_interruptions;

    @Column(name = "Title", unique = true, nullable = false)
    private String title;

    @Column(name = "Details", nullable = false)
    private String details;

    @Column(name = "Time", nullable = false)
    private Long time;

    @Column(name = "IdProject", nullable = false)
    private Long idProject;

    @Column(name = "DocumentUser", nullable = false)
    private Long documentUser;
}
