package edu.eci.arsw.yellowcontactcompany.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import edu.eci.arsw.yellowcontactcompany.dto.LoginDto;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
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
    
   
    @RequestMapping(value = "/selector-options", method = RequestMethod.GET)
    public String selector(Locale locale, Model model) {
        return "selector-options";
    }
    
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Locale locale, Model model) {
        return "about";
    }
    @RequestMapping(value = "/why", method = RequestMethod.GET)
    public String why(Locale locale, Model model) {
        return "why";
    }
    @RequestMapping(value = "/contactus", method = RequestMethod.GET)
    public String contactus(Locale locale, Model model) {
        return "contactus";
    }

    @RequestMapping(value = "/login/validate", method = RequestMethod.POST)
    public ResponseEntity<?> loginValidate(LoginDto loginDto){
        try {
            return new ResponseEntity<>(userservice.findUserLogin(loginDto.getEmail(),loginDto.getPassword()), HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(false, HttpStatus.OK);
        }


    }

}