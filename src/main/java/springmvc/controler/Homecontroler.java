package springmvc.controler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//4th step

@Controller
@RequestMapping("first")
public class Homecontroler {

	// using model
	@RequestMapping(path = "/home", method = RequestMethod.POST)
	public String home(Model model) {

		System.out.println("this is home url ");

		// using add attribute
		model.addAttribute("name", "Mohammed mujahid");
		model.addAttribute("id", 1425);
		List<String> friends = new ArrayList<>();
		friends.add("junaid");
		friends.add("anas");
		friends.add("mukram");
		friends.add("shoiab");
		friends.add("sibu");

		System.out.println(friends);
		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping("/about")
	public String about() {

		System.out.println("this os about page");
		return "about";
	}

//	using modelAndView
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help page");
//		creating ModelAndView object
		ModelAndView modelAndview = new ModelAndView();
		/* setting the data */
		modelAndview.addObject("name", "uttam shukla");
		modelAndview.addObject("rollnumber", 12);
		/* setting the view name */
		modelAndview.setViewName("help");

		return modelAndview;
	}
}
