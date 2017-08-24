package com.andy.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by dell on 2017/8/15.
 */
@Controller
public class SseController {

    @RequestMapping(value = "/push", produces = "text/event-stream")
    @ResponseBody
    public String push() {

        Random random = new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data : Testing 1, 2, 3" + random.nextInt() + "\n\n";
    }

}
