package com.bookexchange.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bookexchange.api.dto.UserDto;
import com.bookexchange.api.exceptions.UserExceptions;
import com.bookexchange.api.mappers.UserMappers;
import com.bookexchange.api.model.UserEnty;
import com.bookexchange.api.repository.UserRepositoy;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserService {

  @Autowired
  private UserRepositoy userRepositoy;
  @Autowired
  private UserMappers userMappers;
  @Autowired
  private PasswordEncoder passwordEncoder;

  public UserDto buscarUsuarioId(long id) {
    return userMappers
        .tUserDto(userRepositoy.findById(id).orElseThrow(() -> new UserExceptions("EL usurio no existe " + id)));
  }

  // función para crear usuario
  public void crearUsuario(UserDto data) {

    UserEnty userEnty = userMappers.toUserEnty(data);

    String password = data.getPassword();
    String passwordhash = passwordEncoder.encode(password);
    userEnty.setPassword(passwordhash);
    userRepositoy.save(userEnty);

  }

}
