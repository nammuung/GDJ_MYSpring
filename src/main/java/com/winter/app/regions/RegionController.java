package com.winter.app.regions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.winter.app.util.Pager;

@Controller
@RequestMapping(value = "/regions/*")
public class RegionController {
	
	@Autowired
	private RegionService regionService;
	
	
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView update(RegionDTO regionDTO, ModelAndView mv)throws Exception{
		
		int result = regionService.update(regionDTO);
		
		String message="수정 실패";
		if(result>0) {
			message="수정 성공";
		}
		mv.addObject("msg", message);
		mv.addObject("path", "./list");
		
		mv.setViewName("commons/result");
		
		return mv;
		
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public void update(RegionDTO regionDTO, Model model)throws Exception{
		regionDTO = regionService.getDetail(regionDTO);
		model.addAttribute("dto", regionDTO);
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String delete(RegionDTO regionDTO, Model model)throws Exception{
		int result = regionService.delete(regionDTO);
		String message="삭제 실패";
		if(result>0) {
			message="삭제 성공";
		}
		model.addAttribute("msg", message);
		model.addAttribute("path", "./list");
		
		return "commons/result";
	}
	
//	MultipartFile photo는 add.jsp에서 from데이터 받아온거 매개변수 선언)
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(RegionDTO regionDTO, Model model, MultipartFile photo) throws Exception {
		int result = regionService.add(regionDTO, photo);
		
		String msg="등록 실패";
		if(result>0) {
			msg = "등록 성공";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("path", "./list");
		
		return "commons/result";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add() {
		
		// /WEB-INF/views/   .jsp
		return "regions/add";
	}
	
	@RequestMapping(value ="detail", method = RequestMethod.GET)
	//파라미터의 이름과 타입을 동일하게 선언
	//id
	public String detail(Long region_id, Model model)throws Exception{
		
		
		RegionDTO regionDTO = new RegionDTO();
		//String id = request.getParameter("region_id");
		
		regionDTO.setRegion_id(region_id);
		
		regionDTO = regionService.getDetail(regionDTO);
		
		//request.setAttribute("dto", regionDTO);
		model.addAttribute("dto", regionDTO);
		
		return "regions/detail";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView list(Pager pager) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		
		List<RegionDTO> ar = regionService.getList(pager);
		
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		mv.setViewName("regions/list");
		
		//return "regions/list";
		return mv;
	}

}