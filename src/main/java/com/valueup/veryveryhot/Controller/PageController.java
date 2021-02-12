package com.valueup.veryveryhot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("product")
    public String index() {
         return "crossproduct.html";
    }

    @RequestMapping("page1")
    public String page1() {
         return "product";
    }
    @RequestMapping("page2")
    public String page2() {
         return "page2";
    }
    @RequestMapping("page3")
    public String page3() {
         return "세금.htm";
    }
    @RequestMapping("page4")
    public String page4() {
         return "신용.htm";
    }
    @RequestMapping("page5")
    public String page5() {
         return "연금.htm";
    }
    @RequestMapping("page6")
    public String page6() {
         return "증권.htm";
    }
    @RequestMapping("page7")
    public String page7() {
         return "카드.htm";
    }
    @RequestMapping("page8")
    public String page8() {
         return "펀드.htm";
    }
    @RequestMapping("page9")
    public String page9() {
         return "일반상식1.htm";
    }
    @RequestMapping("page10")
    public String page10() {
         return "일반상식2.htm";
    }
    @RequestMapping("page11")
    public String page11() {
         return "일반상식3.htm";
    }
    @RequestMapping("page12")
    public String page12() {
         return "세계경제.htm";
    }
    @RequestMapping("page13")
    public String page13() {
         return "대출.htm";
    }
    @RequestMapping("page14")
    public String page14() {
         return "저축.htm";
    }



    
}

