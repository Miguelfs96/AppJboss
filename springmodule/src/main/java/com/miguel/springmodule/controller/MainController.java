package com.miguel.springmodule.controller;

import com.miguel.springmodule.model.Member;
import com.miguel.springmodule.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(value = "/show")
    public ModelAndView showAll(){
        ModelAndView mav = new ModelAndView("show");
        mav.addObject("members", memberService.mostrar());
        return mav;
    }

    @RequestMapping(value= "/add")
    public ModelAndView save (){
        Member m = new Member("alguien@ejemplo.com", "paco", "978635421");
        memberService.save(m);
        ModelAndView mav = new ModelAndView("show");
        mav.addObject("members", memberService.mostrar());
        return mav;
    }
}
