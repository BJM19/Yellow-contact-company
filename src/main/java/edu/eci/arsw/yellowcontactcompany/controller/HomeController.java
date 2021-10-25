package edu.eci.arsw.yellowcontactcompany.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.eci.arsw.yellowcontactcompany.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userservice;
	

	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        
        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate );

        return "home";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Locale locale, Model model) {
        return "login";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Locale locale, Model model) {
        return "register";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<?>  user() {
    	return null;
    }
    
    

}