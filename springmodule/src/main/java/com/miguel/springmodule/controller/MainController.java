package com.miguel.springmodule.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.miguel.springmodule.model.Member;
import com.miguel.springmodule.repository.MemberDao;
import com.miguel.springmodule.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.jms.Queue;
import java.io.IOException;

@Controller
public class MainController {

    @Autowired
    MemberService memberService;

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @RequestMapping(value = "/")
    public ModelAndView showAll(){
        ModelAndView mav = new ModelAndView("show");
        mav.addObject("members", memberService.mostrar());
        return mav;
    }

    @RequestMapping(value= "/add")
    public ModelAndView save (){
        ModelAndView mav = new ModelAndView("add");
        mav.addObject("member", new Member());
        return mav;
    }

    @RequestMapping(value = "/remove")                                      //No en cola
    public ModelAndView remove(@RequestParam("id") long id){
        memberService.remove(id);
        ModelAndView mav= new ModelAndView("show");
        mav.addObject("members", memberService.mostrar());
        return mav;
    }

    @RequestMapping(value = "publish")
    public ModelAndView publish (@ModelAttribute("member")Member member) throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        String members = objectMapper.writeValueAsString(member);
        jmsTemplate.convertAndSend(queue, members);
        return new ModelAndView("end");
    }
}

