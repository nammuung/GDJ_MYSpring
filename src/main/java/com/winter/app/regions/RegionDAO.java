package com.winter.app.regions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.winter.app.util.DBConnector;

@Repository
public class RegionDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.regions.RegionDAO.";
	// final -> 상수
	// namespace => 어떤 mapper를 쓸꺼냐 제일 마지막에 . 찍어줘야함 
	
	//update
	public int update(RegionDTO regionDTO) throws Exception {
		return sqlSession.update(namespace+"update", regionDTO);
	}
	
	//Insert
	public int add(RegionDTO regionDTO)throws Exception{
		
		return sqlSession.insert(namespace+"add", regionDTO);
	}
	
	//detail
	public RegionDTO getDetail(RegionDTO regionDTO)throws Exception{
		return sqlSession.selectOne(namespace+"getDetail", regionDTO);
	}
		// .사용하는 메서드 detail은 select 사용함
		// id값 하나만 조회하기 떄문에 selectOne를 사용함
	

	// 결과물이 여러개이기때문에 list사용
	public List<RegionDTO> getList() throws Exception {
		return sqlSession.selectList(namespace+"getList");
	}
	
	public int delete(RegionDTO regionDTO) throws Exception{
		return sqlSession.delete(namespace+"delete", regionDTO);
	}

}