package com.bitcamp.OpenProject.Service;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.bitcamp.OpenProject.DAO.MemberDao;
import com.bitcamp.OpenProject.model.Member;

@Service
public class MemberViewService {

	@Inject
	private SqlSessionTemplate template;
	
	private MemberDao dao;
	
	public List<Member> selectList(){
		
		dao=template.getMapper(MemberDao.class);
		return dao.selectList();
	}
}
