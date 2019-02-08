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
	
	
	//ȸ�������� �����ִ� �޼ҵ� . 
	@RequestMapping("member/reg")
	public String insertMember() {
		Member member = new Member();
		member.getEmail();
		member.getPassword();
		member.getName();
		member.getPhoto();
		return "member/reg";
	}
	//ȸ�� ����Ʈ�� ȭ������� �����ִ� ��Ʈ�ѷ� 
	@RequestMapping("member/list")
	public String selectList(
			Model model
			){
		List<Member> members= viewService.selectList();
		
		model.addAttribute("members", members);
		
		return "member/list";
	}
	
	
}
