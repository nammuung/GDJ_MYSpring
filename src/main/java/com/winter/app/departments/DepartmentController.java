package com.winter.app.departments;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.winter.app.departments.DepartmentDAO;
import com.winter.app.departments.DepartmentDTO;
import com.winter.app.regions.RegionDTO;

@Controller
@RequestMapping(value = "/department/*")
public class DepartmentController {
//	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
//	// 매개변수 이름을 파라미터의 이름과 타입을 동일하게 선언
//	// 파라미터와 매개변수 이름이 다를 경우 id부분에 @RequestParam("id") Integer region_id  id란 값이 들어오면 region_id에 담으세요 라는 뜻 
//	// defaultValue = "1", required = true -> 필수로 값이 넘어와야함 null이 오는 것을 방지
//	// 스프링에서는 request대신 model에 담아서 보내면댐 (다른 jsp 로 값을 보낼떄)
	public String detail(Integer department_id, Model model)throws Exception{
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(department_id);
		departmentDTO = departmentService.getDetail(departmentDTO);
		model.addAttribute("dto", departmentDTO);
		return "department/detail";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET) 
	public String list(HttpServletRequest request)throws Exception {
		List<DepartmentDTO> ar = departmentService.getList();
		request.setAttribute("list", ar);
		return "department/list";
	}
}
