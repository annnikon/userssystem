package ua.nure.nikonova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.nure.nikonova.dao.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public List getAllUsers() {
		return userDao.getUsers();
	}
}
