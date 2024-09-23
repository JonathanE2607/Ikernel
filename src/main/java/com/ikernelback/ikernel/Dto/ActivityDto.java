package com.ikernelback.ikernel.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActivityDto {
    private Long id_activity;
    private String details;
    private Long id_user;

}
