package com.winter.app.departments;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.MyTest;

public class DepartmentDAOTest extends MyTest{

	@Autowired
	private DepartmentDAO departmentDAO;
	@Test
	public void getDetail() throws Exception{
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(10);
		departmentDTO = departmentDAO.getDetail(departmentDTO);
		
		assertNotNull(departmentDTO);
	}
	@Test
	public void getList() throws Exception {
		List<DepartmentDTO> ar = departmentDAO.getList();
		assertNotEquals(0, ar.size());
	}
	

}
