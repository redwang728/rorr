package com.my.controlle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zunyun on 17-12-6.
 */
@Controller
public class HomeControlle {

    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request, Model model){
        return "/index";
    }

    @RequestMapping(value = "/about")
    public String about(HttpServletRequest request, Model model){
        return "/about";
    }

    @RequestMapping(value = "/contact")
    public String contact(HttpServletRequest request, Model model){
        return "/contact";
    }

    @RequestMapping(value = "/job")
    public String job(HttpServletRequest request, Model model){
        return "/job";
    }

    @RequestMapping(value = "/product")
    public String product(HttpServletRequest request, Model model){
        return "/product";
    }

    @RequestMapping(value = "/serve")
    public String serve(HttpServletRequest request, Model model){
        return "/serve";
    }

}
