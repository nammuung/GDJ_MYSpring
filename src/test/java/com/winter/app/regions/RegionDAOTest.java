package com.winter.app.regions;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;
import com.winter.app.util.Pager;

public class RegionDAOTest extends MyTest{

	@Autowired
	private RegionDAO regionDAO;

	@Test
	public void getListTest() throws Exception{
		Pager pager = new Pager();
		pager.setPage(2L);
		pager.makeRow();
		List<RegionDTO> ar = regionDAO.getList(pager);
		System.out.println(ar.get(0).getRegion_name());
		//단정문 -> ar의 리스트 사이즈가 0이 아니였음 좋겠다.
		assertEquals(10, ar.size());
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
//		for(int i=0;i<100;i++) {
//			regionDTO.setRegion_name("test"+i);
//			int result = regionDAO.add(regionDTO);
//			if(i%10==0) {
//				// 10개집어넣고 쉬다가 0.5초뒤에 시작
//				Thread.sleep(500);
//			}
//		}	
//		System.out.println("100개 입력 완료");
//		assertNotEquals(1, result);
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
