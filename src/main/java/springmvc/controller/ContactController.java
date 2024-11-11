package springmvc.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Creating form");
		return "contact";
	}
	
	//@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(HttpServletRequest request) { //HttpServletRequest is old technique and used to fetch data from the form, pass HttpServletRequest as 
		//parameter in method, this is older technique so instead of this we use @RequestParam-->gives single data at a time
//		String email = request.getParameter("email");
//		System.out.println(email);
	
	//using @RequestParam
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(
//			@RequestParam("email") String userEmail,
//			@RequestParam("userName") String userName,
//			@RequestParam("password")String password,Model model)
//	{
		
		
		//process data here,like storing in database
		
//		model.addAttribute("email", userEmail); // here we set data one by one, in this case class/model/entity User is not created
//		model.addAttribute("username", userName);
//		model.addAttribute("password", password);
		
		//instead of adding each property one by one we will add all in the object(User object) and pass it to model, for that we have to
		//create a User model/Entity class which has all the fields same as one pass/mention in contact.jsp page
		
//		User user = new User(); //when user entity/model created
//		user.setEmail(userEmail);
//		user.setUserName(userName);
//		user.setPassword(password);
//		
//		System.out.println(user);
//		model.addAttribute("user", user);
//		
//		return "success";
//		}
	//on the success page we fetch data as user.fieldname i.e.(user.email), field name of model/entity
	
	//Using @ModelAttribute
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) { //it automatically takes data coming from (JSP)form and bind it to the fields 
		//mention in the model/entity, so we don't have to set data manually one by one like in case of @RequestParam 
	//	model.addAttribute("user", user);
		System.out.println(user);
		int userId = this.userService.createUser(user);
		model.addAttribute("msg", "Registered Successufully "+userId);
		return  "success";
		}
	
	//we can also use @ModelAttribute above/top of handler method, in case we have to use same data/information at multiple location
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Welcome To The Channel");
		m.addAttribute("desc", "Coding channel");
	}

}
