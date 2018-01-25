package ua.nure.nikonova.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import ua.nure.nikonova.model.User;

@Repository
public class UserDao {
private List<User> users = Arrays.asList(new User("admin","admin"),
		new User("user", "test"));

public List<User> getUsers() {
	return users;
}



}
