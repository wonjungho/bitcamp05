package com.bitcamp.OpenProject.Service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.bitcamp.OpenProject.DAO.MemberDao;
import com.bitcamp.OpenProject.model.Member;

@Service
public class MemberRegService {

	@Inject
	private SqlSessionTemplate template;
	
	private MemberDao dao;
	
	public int insertMember(Member member) {
		
		dao=template.getMapper(MemberDao.class);
		
		return dao.insertMember(member);
	}
}
