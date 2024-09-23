package com.ikernelback.ikernel.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectsDto {
    private String nameProject;
    private String description;
    private String developers;
    private String phase;
    private String leader;
}
