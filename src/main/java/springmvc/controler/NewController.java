package springmvc.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import springmvc.model.User;
import springmvc.service.UserServices;

@Controller
public class NewController {

	@RequestMapping("contact")
	public String showForm() {
		return "contact";
	}
	
	@Autowired
	private UserServices userService;
	

	/*
	 * Old way
	 * 
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(HttpServletRequest request) {
	 * 
	 * String email = request.getParameter("email"); System.out.println(email);
	 * return ""; }
	 */

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String
	 * userEmail, @RequestParam("name") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model) {
	 * 
	 * System.out.println("User email " + userEmail);
	 * System.out.println("User name " + userName);
	 * System.out.println("User password " + userPassword);
	 * 
	 * model.addAttribute("userName", userName); model.addAttribute("userEmail",
	 * userEmail); model.addAttribute("userPassword", userPassword); return
	 * "success"; }
	 */

	/*
	 * this is by using the requestparam as an attribute and model as an attribute
	 * abd using user class
	 */
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String
	 * userEmail, @RequestParam("name") String userName,
	 * 
	 * @RequestParam("password") String userPassword, Model model) {
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setName(userName);
	 * user.setPassword(userPassword);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * System.out.println("User email " + userEmail);
	 * System.out.println("User name " + userName);
	 * System.out.println("User password " + userPassword);
	 * 
	 * return "success"; }
	 */

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user) {
		System.out.println(user);
		this.userService.createUser(user);
		return "success";
	}
	
}
