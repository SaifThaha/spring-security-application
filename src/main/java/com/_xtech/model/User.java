package com._xtech.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank(message = "username cannot be blank")
    private String username;

    @NotNull
    @NotBlank(message = "password cannot be blank")
    private String password;

    @NotNull
    @NotBlank(message = "role cannot be blank")
    private String role;
}
