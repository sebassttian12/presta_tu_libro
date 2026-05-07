package com.bookexchange.api.mappers;

import org.springframework.stereotype.Component;

import com.bookexchange.api.dto.UserDto;
import com.bookexchange.api.model.UserEnty;

@Component
public class UserMappers {

  public UserEnty toUserEnty(UserDto userDto) {

    return UserEnty.builder()
        .nombre(userDto.getNombre())
        .correo(userDto.getCorreo())
        .password(userDto.getPassword())
        .imagen(userDto.getImagen())
        .build();
  }

  public UserDto tUserDto(UserEnty userEnty) {

    return UserDto.builder()
        .nombre(userEnty.getNombre())
        .id(userEnty.getId())
        .imagen(userEnty.getImagen())
        .build();
  }
}
