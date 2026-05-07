package com.bookexchange.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bookexchange.api.dto.errDto;
import com.bookexchange.api.exceptions.UserExceptions;

@RestControllerAdvice
public class ControllerGlobalExceptions {

  @ExceptionHandler(UserExceptions.class)
  public ResponseEntity<errDto> globalUserExptionsUsuario(UserExceptions uex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new errDto(uex.getMessage()));
  }
  // manejo para execión de crear un libro

  // maanejo para execión de crear un petición de un libro

}
