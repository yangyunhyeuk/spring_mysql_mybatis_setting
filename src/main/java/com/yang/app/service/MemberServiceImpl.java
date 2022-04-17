package com.yang.app.service;

import com.yang.app.dao.MemberDao;
import com.yang.app.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {


    private final MemberDao memberDao;

    public List<Member> getMemberList() {
        return memberDao.getBoardList();
    }
}
