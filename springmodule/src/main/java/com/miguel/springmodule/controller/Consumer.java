package com.miguel.springmodule.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.miguel.springmodule.model.Member;
import com.miguel.springmodule.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Consumer {

    @Autowired
    MemberService memberService;

    @Autowired
    ObjectMapper objectMapper;

    @JmsListener(destination = "member-queue")
    public void listener(String member) throws IOException{
        Member memb = objectMapper.readValue(member, Member.class);
        memberService.save(memb);
    }
}
