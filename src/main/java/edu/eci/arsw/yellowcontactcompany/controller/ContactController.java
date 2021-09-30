package edu.eci.arsw.yellowcontactcompany.controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Controller
public class ContactController {

    @RequestMapping("/contacts/{area}")
    public String index(Model model, @PathVariable("area") String areapath){
    	model.addAttribute("area",areapath);
        return "contacts";
    }
}
