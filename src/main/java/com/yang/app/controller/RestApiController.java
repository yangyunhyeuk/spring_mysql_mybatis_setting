package com.yang.app.controller;


import com.sun.istack.internal.NotNull;
import com.yang.app.domain.Member;
import com.yang.app.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestApiController {

    private final MemberServiceImpl memberService;
/*
    @GetMapping("/board")
    public String getBoardList(Model model) {
        List<Member> memberList = memberService.getMemberList();
        model.addAttribute("memberList", memberList);
        return "board";
    }
    */
}
