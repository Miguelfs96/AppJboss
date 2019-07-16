package com.miguel.springmodule.service;

import com.miguel.springmodule.model.Member;
import com.miguel.springmodule.repository.dto.GeneralDto;

import java.util.ArrayList;

public interface MemberService {

    void save(Member member);

    ArrayList mostrar();

    void remove (long id);

    GeneralDto edit (long id);

}
