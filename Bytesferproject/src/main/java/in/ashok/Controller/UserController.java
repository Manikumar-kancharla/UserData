package in.ashok.Controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.ashok.entity.Users;
import in.ashok.service.Service1;

@Controller
public class UserController {
	
	@Autowired
	private Service1 serve;

	@GetMapping("/index")
	public ModelAndView getUsers() {
		ModelAndView mav=new ModelAndView();
		List<Users> udetails=serve.getAlldetails();
		mav.addObject("user",udetails );
		mav.setViewName("index");
		
		return mav;
	}

}
