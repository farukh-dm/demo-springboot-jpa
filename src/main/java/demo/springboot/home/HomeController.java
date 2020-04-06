package demo.springboot.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {
	
	@RequestMapping(value = "")
	public String home() {
	
		return "You are Home!";
	
	}

}
