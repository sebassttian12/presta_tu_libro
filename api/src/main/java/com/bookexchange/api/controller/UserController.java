package com.bookexchange.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookexchange.api.dto.UserDto;
import com.bookexchange.api.service.UserService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/")
@Slf4j

public class UserController {

  // toda la configuración de la clase - propiedades
  @Autowired
  private UserService userService;

  // todo el manejo de las peticiones http

  @GetMapping("user/{id}")
  public ResponseEntity<UserDto> getUser(@PathVariable Long id) {
    UserDto dataUserDto = userService.buscarUsuarioId(id);
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(dataUserDto);
  }

  @PostMapping("user")
  public ResponseEntity<String> crearUsuario(@Valid @RequestBody UserDto data) {

    System.out.println(data);
    userService.crearUsuario(data);
    return ResponseEntity.status(HttpStatus.CREATED).body("EL usuario fue credo correctamente");

  }

}