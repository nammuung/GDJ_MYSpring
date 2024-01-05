package com.winter.app.regions;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;

public class RegionDAOTest extends MyTest{

	@Autowired
	private RegionDAO regionDAO;

	@Test
	public void getListTest() throws Exception{
		List<RegionDTO> ar = regionDAO.getList();
		
		//단정문 -> ar의 리스트 사이즈가 0이 아니였음 좋겠다.
		assertNotEquals(0, ar.size());
	}
	
	
	@Test
	public void getDetailTest() throws Exception {
		//test라서 dto가 없음 만들어줘야함
		RegionDTO regionDTO = new RegionDTO();
		regionDTO.setRegion_id(1);
		regionDTO = regionDAO.getDetail(regionDTO);
	
		//단정문 낫널
		assertNotNull(regionDTO);
	}
	
	@Test
	public void addTest () throws Exception{
		RegionDTO regionDTO = new RegionDTO();
		regionDTO.setRegion_name("test");
		int result = regionDAO.add(regionDTO);
		
		assertNotEquals(1, result);
	}
	
	@Test
	public void updateTest ()  throws Exception{
		RegionDTO regionDTO = new RegionDTO();
		regionDTO.setRegion_name("gsd");
		regionDTO.setRegion_id(221);
		int result = regionDAO.update(regionDTO);
		assertNotEquals(1, result);
	}
	
	@Test
	public void deleteTest () throws Exception{
		RegionDTO regionDTO = new RegionDTO();
		regionDTO.setRegion_id(223);
		int result = regionDAO.delete(regionDTO);
		assertNotNull(result);
	}
	
	
	
}
