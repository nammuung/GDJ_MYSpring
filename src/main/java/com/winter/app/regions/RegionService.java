package com.winter.app.regions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//DAO 보내기전 전처리, 후처리 작업
@Service // 객체 생성
public class RegionService {

	// 선언만 해놓으면 null 의존성 주입을 해줘야함
	@Autowired // 의존성 주입
	private RegionDAO regionDAO;

	// list
	public List<RegionDTO> getList() throws Exception {
		List<RegionDTO> ar = this.regionDAO.getList();

		return ar;
	}

}
