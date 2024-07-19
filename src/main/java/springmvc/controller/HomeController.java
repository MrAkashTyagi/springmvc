package springmvc.controller;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home controller");
		model.addAttribute("name", "Akash Tyagi");
		model.addAttribute("id", 101);

		List<String> names = new ArrayList<String>();
		names.add("anuj");
		names.add("shubham");
		names.add("vishu");

		model.addAttribute("friends", names);

		return "home";
	}
	
	
	@RequestMapping("/welcome")
	public String welcomeForm(Model m, @RequestParam("input-box") String name) {
		m.addAttribute("name", name);
		System.out.println(name);
		return "welcome";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about url");
		return "about";
	}

	@RequestMapping("/services")
	public String services() {
		System.out.println("This is services url");
		return "";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Akash Tyagi");
		modelAndView.addObject("rollnumber", 101);
		modelAndView.setViewName("help");
		LocalDateTime date = LocalDateTime.now();
		modelAndView.addObject("date",date);
		System.out.println("This is help url");
		
		//marks
		List<Integer> marks = new ArrayList<Integer>();
		
		marks.add(101);
		marks.add(102);
		marks.add(103);
		marks.add(104);
		modelAndView.addObject("marks",marks);
		
		return modelAndView;
	}

}
