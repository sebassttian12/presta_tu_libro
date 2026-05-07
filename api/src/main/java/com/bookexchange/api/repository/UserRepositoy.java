package com.bookexchange.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bookexchange.api.model.UserEnty;

@Repository
public interface UserRepositoy extends CrudRepository<UserEnty, Long> {

}
