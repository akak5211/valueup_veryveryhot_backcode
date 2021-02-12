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
         return "세금.htm";
    }
    @RequestMapping("page4") //신용
    public String page4() {
         return "신용.htm";
    }
    @RequestMapping("page5") //연금
    public String page5() {
         return "연금.htm";
    }
    @RequestMapping("page6") //증권
    public String page6() {
         return "증권.htm";
    }
    @RequestMapping("page7") //카드
    public String page7() {
         return "카드.htm";
    }
    @RequestMapping("page8") //펀드
    public String page8() {
         return "펀드.htm";
    }
    @RequestMapping("page9") //일반상식1
    public String page9() {
         return "일반상식1.htm";
    }
    @RequestMapping("page10") //일반상식2
    public String page10() {
         return "일반상식2.htm";
    }
    @RequestMapping("page11") //일반상식3
    public String page11() {
         return "일반상식3.htm";
    }
    @RequestMapping("page12") //세계경제
    public String page12() {
         return "세계경제.htm";
    }
    @RequestMapping("page13") //대출
    public String page13() {
         return "대출.htm";
    }
    @RequestMapping("page14") //저축
    public String page14() {
         return "저축.htm";
    }



    
}

