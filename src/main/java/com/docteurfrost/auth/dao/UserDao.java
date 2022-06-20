package com.docteurfrost.auth.dao;

import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<DAOUser, Integer> {
	DAOUser findByUsername(String username);
}
