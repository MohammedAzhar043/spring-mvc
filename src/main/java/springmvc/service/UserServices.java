package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvc.dao.UserDao;
import springmvc.model.User;

@Service
public class UserServices {

	@Autowired
	private UserDao userDao;

	@Transactional
	public int createUser(User user) {

		return this.userDao.saveUser(user);
	}
}
