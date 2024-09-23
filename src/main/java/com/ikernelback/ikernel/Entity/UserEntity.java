package com.ikernelback.ikernel.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_Id")
    private Long user_Id;

    @Column(name = "password")
    private String password;

    @Column(name = "document")
    private Long document;

}
