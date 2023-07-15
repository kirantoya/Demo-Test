package com.kiranproject.springbootpracticeproject.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TestController {

    /**
     * @return
     */
    @RequestMapping("/")
    public ModelAndView firstPage(){

        return new ModelAndView("welcome");
        
    }
    
}
