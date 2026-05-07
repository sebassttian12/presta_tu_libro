package com.bookexchange.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

// el que viene del usuario a db
public class UserDto {

  private Long id;

  @NotBlank(message = "el nombre no debe estar vacio")
  @NonNull
  private String nombre;

  @NotNull
  @Email(message = "debe ser un correo valido: test@test.com")
  private String correo;

  @NotBlank
  @NotNull
  private String password;

  private String imagen;
}
