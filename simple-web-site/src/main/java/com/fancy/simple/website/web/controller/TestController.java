package com.fancy.simple.website.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * this is a class ....
 *
 * @author fanlanyue
 * @Date 2016/2/16
 */
@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * test
     */
    @RequestMapping("ttt")
    public String test() {
        return "test";
    }
}
