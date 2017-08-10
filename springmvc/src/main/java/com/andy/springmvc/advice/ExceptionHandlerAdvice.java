package com.andy.springmvc.advice;

import org.springframework.expression.Expression;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dell on 2017/8/7.
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e, WebRequest request) {

        ModelAndView view = new ModelAndView("error");
        view.addObject("errorMsg", e.getMessage());
        return view;
    }

    @ModelAttribute
    public void addAttribute(Model model) {
        model.addAttribute("msg", "额外的信息");
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
    }
}
