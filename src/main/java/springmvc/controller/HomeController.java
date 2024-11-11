package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//step-->4
//sending data from controller to view
@Controller  // we have to enable this in config file
//@RequestMapping(path="/first")

public class HomeController {
	
	//@RequestMapping("/home")  //it shows home method only work when we fire/execute,"/home"
	
	@RequestMapping(path="/home",method=RequestMethod.GET)//this is used when we have to specify path along with method used
	public String home(Model model) { //we have to create methods to handle url i.e.(index)
		//we used Model object mainly to sent data dynamically from controller-->view, in view we have to use scriplet tag(<% %>)
		//and httpservletrequest to get data on view and print it using expression tag(<%= %>)
		model.addAttribute("name", "Sonam");
		model.addAttribute("Id", 143);
		List<String>friends = new ArrayList<String>();
		
		friends.add("Raju");
		friends.add("Harsh");
		friends.add("Sonam");
		friends.add("Ishika");
		model.addAttribute("f", friends);
		
		
		System.out.println("This is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is the about us page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is the help page");
		
		//creating object of ModelAndView
		ModelAndView modelandview = new ModelAndView();
		//setting or adding the data
		modelandview.addObject("name", "Harsh");
		modelandview.addObject("roll", 124);
		
		List<Integer>list = new ArrayList<Integer>();
		list.add(50);
		list.add(60);
		list.add(85);
		list.add(95);
		
	modelandview.addObject("marks", list);
		
		//setting the view or page to show
		modelandview.setViewName("help");
		
		return modelandview;
	}

}
