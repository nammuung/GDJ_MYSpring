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
	
}
