package com.ikernelback.ikernel.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;

@NoArgsConstructor
@Setter
@Getter
@Entity
@CrossOrigin(origins="http://localhost:5173")
@Table(name = "peoples")
public class PeopleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "people_Id", nullable = false)
    private Long id;

    @Column(name = "Document_type", nullable = false)
    private Long document_type;

    @Column(name = "Document", unique = true, nullable = false)
    private Long document;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "LastName", nullable = false)
    private String lastName;

    @Column(name = "BirthDate", nullable = false)
    private Date birthDate;

    @Column(name = "Direcction", nullable = false)
    private String direcction;

    @Column(name = "Profession", nullable = false)
    private String profession;

    @Column(name = "Specialty", nullable = false)
    private String specialty;

    @Column(name = "TypeOfWorker", nullable = false)
    private String typeOfWorker;

    @Column(name = "Email", nullable = false)
    private String email;


}
