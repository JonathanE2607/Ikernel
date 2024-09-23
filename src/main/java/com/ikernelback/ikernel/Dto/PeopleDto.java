package com.ikernelback.ikernel.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeopleDto {
    private Long id;
    private Long document;
    private String name;
    private String lastName;
    private Date birthDate;
    private String direcction;
    private String profession;
    private String specialty;
    private String typeOfWorker;
    private String email;

}
