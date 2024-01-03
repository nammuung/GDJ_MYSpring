package com.winter.app.bank;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/product/*")
public class BankController {
	
	private Bank_DAO bank_DAO;
	public BankController() {
		this.bank_DAO = new Bank_DAO();
	}
	
	//list
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView  getList() throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("List");
		Bank_DAO bank_DAO = new Bank_DAO();
		List<Bank_DTO> ar=bank_DAO.getList();
		
		mv.addObject("list", ar);
		mv.setViewName("product/list");
		return mv;
	}

	// detail
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(Long productNum, Model model ) throws Exception {

		return "product/detail";
	}

}
