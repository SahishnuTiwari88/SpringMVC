package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

//it has mainly designed for the purpose if we have to redirect from one page/url to other url/page
// these are of 3 types 1)HttpServletResponse (tradition technique of servlet can be used in spring also)
// 2) redirect prefix 3)RedirectView

@Controller
public class RedirectController {
	
	//using redirect prefix
//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("This is one handler");
//		return "redirect:/enjoy";  //using redirect prefix(internal redirect,pass relative url i.e. with (/))
//	}
//now we are going to use redirect i.e. if someone open one then it will send/transfer us on two.
	
	//same operation using RedirectView
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("enjoy"); // we pass absolute url i.e. without (/)
		return redirectView;
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This is two(enjoy) handler");
		return "";
		}

}
