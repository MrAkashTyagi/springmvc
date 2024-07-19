package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

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
	
	@ModelAttribute
	public void commonDataForModel(Model m) {		
		m.addAttribute("Header", "Learn Code with me");
		m.addAttribute("Desc", "Home for programmer");		
		System.out.println("adding model data to form");
	}
	
	
	@RequestMapping("/contact")
	public String showForm(Model m) {		
//		m.addAttribute("Header", "Learn Code with me");
//		m.addAttribute("Desc", "Home for programmer");
		System.out.println("creating form");
		return "contact";		
	}
	
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {	
//		model.addAttribute("Header", "Learn Code with me");
//		model.addAttribute("Desc", "Home for programmer");
		
		this.userService.createUser(user);
		System.out.println("form sunbmitted");
		
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
			
		}
		
		model.addAttribute("msg","User added successfully");
		return "success";
	}	
}

/*
@RequestMapping(path = "/processForm", method = RequestMethod.POST)
public String handleForm(
		@RequestParam("userEmail")  String email,
		@RequestParam("userName") String name,
		@RequestParam("userPassword") String password,
		Model model
		) {
	
	User user = new User();
	
	user.setUserEmail(email);
	user.setUserName(name);
	user.setUserPassword(password);
	
	System.out.println("user : "+user);

//	System.out.println("user email : "+email);
//	System.out.println("user name : "+name);
//	System.out.println("user password : "+password);
	
	//process
//	
//	model.addAttribute("useremail",email);
//	model.addAttribute("username",name);
//	model.addAttribute("password", password);
	
	model.addAttribute("user", user);
	
	return "success";
}

*/

