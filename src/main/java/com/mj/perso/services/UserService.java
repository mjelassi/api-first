package com.mj.perso.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mj.perso.api.UsersApiDelegate;
import com.mj.perso.model.User;

@Service
public class UserService implements UsersApiDelegate {


	@Override
	public ResponseEntity<User> getUser(Integer id) {
		return ResponseEntity.ok().body(new User().id(id).firstName("Hello").lastName("World"));
	}

	@Override
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.ok().body(Arrays.asList(new User().id(1).firstName("Hello").lastName("World")));
	}
	
}
