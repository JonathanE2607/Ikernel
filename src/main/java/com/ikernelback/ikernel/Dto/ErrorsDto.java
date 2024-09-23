package com.ikernelback.ikernel.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorsDto {

    private Long idErrors;
    private String nameError;
    private String details;
    private String time;
    private Long idProject;
    private Long documentUser;

}
