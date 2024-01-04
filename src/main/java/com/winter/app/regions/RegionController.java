package com.winter.app.regions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/regions/*")
public class RegionController {
	//@Autowired
//	@Repository
	@Autowired
	private RegionService RegionService;

//	public RegionController() {
//		// 객체가 만들어질때 멤버 변수로 집어 넣자
//		this.regionDAO = new RegionDAO();
//	}

//	@RequestMapping(value = "add", method = RequestMethod.POST)
//	public String add(RegionDTO regionDTO, Model model) throws Exception {
//		/*
//		 * String id = request.getParameter("region_id"); String name =
//		 * request.getParameter("region_name");
//		 * 
//		 * RegionDTO regionDTO = new RegionDTO();
//		 * regionDTO.setRegion_id(Integer.parseInt(id)); regionDTO.setRegion_name(name);
//		 */
//
//		int result = this.regionDAO.add(regionDTO);
//
//		String msg = "등록 실패임";
//		if (result > 0) {
//			msg = "등록 성공임";
//		}
//		// key는 스트링 내마음대로 쓰면댐
//		// 벨류는 오브젝트
//		model.addAttribute("msg", msg);
//		model.addAttribute("path", "./list");
////		request.setAttribute("msg", msg);
////		request.setAttribute("path", "./list");
//
//		return "commons/result";
//	}
//
//	@RequestMapping(value = "add")
//	public String add() {
//		// WEB_INF/views/ .jsp
//		return "regions/add";
//	}
//
//	@RequestMapping(value = "detail", method = RequestMethod.GET)
//	// 매개변수 이름을 파라미터의 이름과 타입을 동일하게 선언
//	// 파라미터와 매개변수 이름이 다를 경우 id부분에 @RequestParam("id") Integer region_id  id란 값이 들어오면 region_id에 담으세요 라는 뜻 
//	// defaultValue = "1", required = true -> 필수로 값이 넘어와야함 null이 오는 것을 방지
//	// 스프링에서는 request대신 model에 담아서 보내면댐 (다른 jsp 로 값을 보낼떄)
//	public String detail(Integer region_id, Model model) throws Exception {
//		RegionDAO regionDAO = new RegionDAO();
//		RegionDTO regionDTO = new RegionDTO();
////		String id = request.getParameter("region_id");
//// 		regionDTO.setRegion_id(Integer.parseInt(id));
//
//		regionDTO.setRegion_id(region_id);
//		regionDTO = regionDAO.getDetail(regionDTO);
//
//		//request.setAttribute("dto", regionDTO);
//		model.addAttribute("dto", regionDTO);
//		return "regions/detail";
//	}

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView list() throws Exception {
		ModelAndView mv = new ModelAndView();
		List<RegionDTO> ar = RegionService.getList();
		mv.addObject("list", ar);
		mv.setViewName("regions/list");

		return mv;
	}
}
