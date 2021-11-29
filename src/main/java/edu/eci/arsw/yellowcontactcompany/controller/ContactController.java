package edu.eci.arsw.yellowcontactcompany.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arsw.yellowcontactcompany.model.User;
import edu.eci.arsw.yellowcontactcompany.service.UserService;


@Controller
public class ContactController {

    @Autowired
    private UserService userService;

    @RequestMapping("/contacts/{area}")
    public String index(Model model, @PathVariable("area") String areapath){
        List<User> users = userService.findUserByArea(areapath);
    	model.addAttribute("area", areapath);
        model.addAttribute("users", users);
        
        return "contacts";
    }

    // @RequestMapping("/contacts/{area}")
    // public List<User> getUserByArea(@PathVariable String area){
    //     List<User> users = userService.findUserByArea(area);

    //     if(users == null) {
    //         throw new RuntimeException("No se encontraron usuarios con el area - "+area);
    //     }
    //     return users;
    // }
}
