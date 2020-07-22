package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

