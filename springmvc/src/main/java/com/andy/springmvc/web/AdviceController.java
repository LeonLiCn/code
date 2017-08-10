package com.andy.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.IllegalTransactionStateException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dell on 2017/8/7.
 */
@Controller
public class AdviceController {

    @RequestMapping(value = "/advice")
    public String getSomething(@ModelAttribute("msg") String msg, Object o) {
        throw new IllegalArgumentException("参数有误" + "来自@ModelAttribute" + msg);
    }

}
