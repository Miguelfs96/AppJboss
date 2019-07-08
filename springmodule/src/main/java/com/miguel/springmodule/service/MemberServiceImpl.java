package com.miguel.springmodule.service;

import com.miguel.springmodule.model.Member;
import com.miguel.springmodule.repository.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberDao memberDao;

    @Override
    public void save(Member member) {
        memberDao.save(member);

    }

    @Override
    public ArrayList mostrar() {
        return new ArrayList<>(memberDao.findAll());
    }
}
