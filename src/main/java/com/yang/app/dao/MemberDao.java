package com.yang.app.dao;


import com.yang.app.domain.Member;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberDao {

    private final SqlSessionTemplate sqlSession;


    private final static String namespace = "mappers.mapper";

    public List<Member> getBoardList() {
        return this.sqlSession.selectList(namespace + ".selectMember");
    }

}
