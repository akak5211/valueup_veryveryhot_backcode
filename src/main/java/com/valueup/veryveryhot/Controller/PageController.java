package com.valueup.veryveryhot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("product")
    public String index() {
         return "crossproduct.html";
    }

    @RequestMapping("page1") //금융상품
    public String page1() {
         return "product";
    }
    @RequestMapping("page2") //보험
    public String page2() {
         return "page2";
    }
    @RequestMapping("page3") //세금
    public String page3() {
         return "page3";
    }
    @RequestMapping("page4") //신용
    public String page4() {
         return "page4";
    }
    @RequestMapping("page5") //연금
    public String page5() {
         return "page5";
    }
    @RequestMapping("page6") //증권
    public String page6() {
         return "page6";
    }
    @RequestMapping("page7") //카드
    public String page7() {
         return "page7";
    }
    @RequestMapping("page8") //펀드
    public String page8() {
         return "page8";
    }
    @RequestMapping("page9") //일반상식1
    public String page9() {
         return "page9";
    }
    @RequestMapping("page10") //일반상식2
    public String page10() {
         return "page10";
    }
    @RequestMapping("page11") //일반상식3
    public String page11() {
         return "page11";
    }
    @RequestMapping("page12") //세계경제
    public String page12() {
         return "page12";
    }
    @RequestMapping("page13") //대출
    public String page13() {
         return "page13";
    }
    @RequestMapping("page14") //저축
    public String page14() {
         return "page14";
    }



    
}

