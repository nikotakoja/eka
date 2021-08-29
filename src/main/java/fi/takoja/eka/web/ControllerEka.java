package fi.takoja.eka.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerEka {

	
	@RequestMapping("/index")
	@ResponseBody
	public String returnForindex() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	@ResponseBody
	public String returnForContact() {
		return "This is the contact page";
	
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String returnForHello(@RequestParam(name ="name") String name, @RequestParam(name="location") String location) {
		return "Welcome to the " + location + " " + name + "!";
	
	}
}

