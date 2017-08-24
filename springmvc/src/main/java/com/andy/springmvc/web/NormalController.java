package com.andy.springmvc.web;

import com.andy.springmvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by andy on 2017/8/24.
 */
@Controller
public class NormalController {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/normal")
    public String testPage(Model model) {
        model.addAttribute("msg", demoService.sayHello());
        return "page";
    }

}
