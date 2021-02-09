package com.valueup.veryveryhot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("product")
    public String index() {
         return "crossproduct.html";
    }
    
}

