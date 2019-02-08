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

	//ȸ������ ��Ʈ�ѷ�
	@RequestMapping(value="member/regform", method=RequestMethod.POST)
	public int insertMember(Member m) {
		
		return mdao.insertMember(m);
	}
	
	
	// ȸ�� ����Ʈ�� ȭ������� �����ִ� ��Ʈ�ѷ�
	@RequestMapping("member/list")
	public String selectList(Model model) {
		List<Member> members = viewService.selectList();

		model.addAttribute("members", members);

		return "member/list";
	}

}
