package com.miguel.springmodule.service;

import com.miguel.springmodule.model.Member;

import java.util.ArrayList;

public interface MemberService {

    void save(Member member);

    ArrayList mostrar();

}
