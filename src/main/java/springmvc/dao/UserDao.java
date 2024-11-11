package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository  //it is repository class so instead of using @Component for creating and inject object we have to use @Repository 
//b/c it automatically create object and inject at mention place.
public class UserDao {
	
	@Autowired//injected from xml file
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveUser(User user) {
		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
	}

}
