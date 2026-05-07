package com.bookexchange.api.exceptions;

public class UserExceptions extends RuntimeException {

  public UserExceptions(String message) {
    super(message);
  }

  public UserExceptions(String message, Throwable cause) {
    super(message, cause);
  }

}
