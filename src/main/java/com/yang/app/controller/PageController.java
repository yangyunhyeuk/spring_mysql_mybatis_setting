package com.yang.app.controller;

import com.yang.app.domain.Member;
import com.yang.app.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PageController {

    private final MemberServiceImpl memberService;

    @RequestMapping(value = "main")
    public String index() {
        return "index";
    }

    // 로그인 페이지 이동
    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String loginPrint() {
        return "signin";
    }

    @RequestMapping(value = "/signup")
    public String signup() {
        return "signup";
    }


    @GetMapping("/board")
    public String getBoardList(Model model) {
        List<Member> memberList = memberService.getMemberList();
        model.addAttribute("memberList", memberList);
        return "board";
    }
}
