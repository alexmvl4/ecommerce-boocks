package com.dabel.boock.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {

    @NotEmpty(message = "firstname es requerido")
    @NotBlank(message = "firstname es requerido")
    private String firstname;
    @NotEmpty(message = "lastname es requerido")
    @NotBlank(message = "lastname es requerido")
    private String lastname;
    @Email(message = "Email is not formmatted")
    @NotEmpty(message = "email es requerido")
    @NotBlank(message = "email es requerido")
    private String email;
    @NotEmpty(message = "password es requerido")
    @NotBlank(message = "password es requerido")
    @Size(min = 8, message = "Password deveria de tener 8 caracteres de longitud")
    private String password;

}
