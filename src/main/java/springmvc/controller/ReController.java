package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public RedirectView one() {
		RedirectView redirectView = new RedirectView();
		System.out.println("This is one handler");
		/* return "redirect: second"; */
		redirectView.setUrl("second");
		
		return redirectView;
	}

	@RequestMapping("/second")
	public String second() {
		System.out.println("This is second handler");
		return "contact";
	}

}
