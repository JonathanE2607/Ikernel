package com.ikernelback.ikernel.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class InterruptionsDto {
    private Long id;
    private String title;
    private String details;
    private Long time;
    private Long idProject;
    private Long documentUser;
}
