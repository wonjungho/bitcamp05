package com.bitcamp.OpenProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.OpenProject.DAO.MemberDao;
import com.bitcamp.OpenProject.Service.MemberRegService;
import com.bitcamp.OpenProject.Service.MemberViewService;
import com.bitcamp.OpenProject.model.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberDao mdao;
	@Autowired
	private MemberRegService regService;
	@Autowired
	private MemberViewService viewService;

	//회원가입 컨트롤러
	@RequestMapping(value="member/regform", method=RequestMethod.POST)
	public int insertMember(Member m) {
		
		return mdao.insertMember(m);
	}
	
	
	// 회원 리스트로 화면단으로 보내주는 컨트롤러
	@RequestMapping("member/list")
	public String selectList(Model model) {
		List<Member> members = viewService.selectList();

		model.addAttribute("members", members);

		return "member/list";
	}

}
