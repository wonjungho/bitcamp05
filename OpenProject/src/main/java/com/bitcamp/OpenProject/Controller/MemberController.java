package com.bitcamp.OpenProject.Controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.OpenProject.Service.MemberRegService;
import com.bitcamp.OpenProject.Service.MemberViewService;
import com.bitcamp.OpenProject.model.Member;

@Controller
public class MemberController {

	@Inject
	private MemberRegService regService;
	@Inject
	private MemberViewService viewService;
	
	
	//회원가입을 시켜주는 메소드 . 
	@RequestMapping("member/reg")
	public String insertMember() {
		Member member = new Member();
		member.getEmail();
		member.getPassword();
		member.getName();
		member.getPhoto();
		return "member/reg";
	}
	//회원 리스트로 화면단으로 보내주는 컨트롤러 
	@RequestMapping("member/list")
	public String selectList(
			Model model
			){
		List<Member> members= viewService.selectList();
		
		model.addAttribute("members", members);
		
		return "member/list";
	}
	
	
}
