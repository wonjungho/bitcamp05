package com.bitcamp.OpenProject.DAO;

import java.util.List;

import com.bitcamp.OpenProject.model.Member;


public interface MemberDao {
	
	public int insertMember(Member member);
	
	public List<Member> selectList();

}
