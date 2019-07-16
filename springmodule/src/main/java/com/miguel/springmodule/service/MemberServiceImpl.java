package com.miguel.springmodule.service;

import com.miguel.springmodule.model.Member;
import com.miguel.springmodule.repository.MemberDao;
import com.miguel.springmodule.repository.dto.GeneralDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

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

    @Override
    public void remove(long id) {
        memberDao.deleteById(id);
    }

    @Override
    public GeneralDto edit(long id) {
        GeneralDto generalDto = new GeneralDto();
        Optional<Member> m =memberDao.findById(id);
        Member member = m.get();

        generalDto.setId(member.getId());
        generalDto.setEmail(member.getEmail());
        generalDto.setName(member.getName());
        generalDto.setNumber(member.getNumber());
        return generalDto;
    }
}
