package com.miguel.springmodule.repository;

import com.miguel.springmodule.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao extends JpaRepository<Member, Long> {
}
