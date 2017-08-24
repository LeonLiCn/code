package com.andy.springmvc.web;

import com.andy.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dell on 2017/8/14.
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/converter", produces = {"applicaion/x-wisely"})
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj obj) {

        return obj;
    }

}
