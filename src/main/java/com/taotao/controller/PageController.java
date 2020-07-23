package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
+页面展示
 */
@Controller
public class PageController {


    @RequestMapping({"/","index.jsp"})
    public String showIndex(){
        return "index";

    }

    @RequestMapping("/{page}")
    public String showIndex(@PathVariable String page){
        return page;
    }

}

