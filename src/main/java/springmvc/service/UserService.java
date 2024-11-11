package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.UserDao;
import springmvc.model.User;


@Service  // if it is a normal class we have to use @Component to create it's object and inject at specific/mention location.
//But for service class we have to mention @Service to create and inject it's object
public class UserService {
	
	@Autowired  // if we try to inject the object using @Autowired, in this case we just have to declare it somewhere. Like in this
	//case i am injecting object of userDao , so it's class that has been already been declared/created/available in Dao.
	private UserDao userDao;
	public int createUser(User user) {
		 return this.userDao.saveUser(user);
		
	}

}
