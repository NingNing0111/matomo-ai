package com.ning.matomochatgpt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: DemoController <br/>
 *
 * @author Ning <br/>
 * @date 2023/10/18 0018
 * @since JDK 11
 */
@Controller
public class DemoController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/demo")
    public String demo(){
        return "forward:demo.html";
    }
}
