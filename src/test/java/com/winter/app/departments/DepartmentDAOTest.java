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
	
	@Test
	public void addTest() throws Exception{
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_name("gddfsdf");
		departmentDTO.setManager_id(200);
		departmentDTO.setLocation_id(1500);
		int result = departmentDAO.add(departmentDTO);
		
		assertEquals(1, result);
	}
	
	@Test
	public void updateTest() throws Exception{
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(280);
		departmentDTO.setDepartment_name("dgdgdg");
		assertNotNull(departmentDTO);
	}
	
	public void deleteTest() throws Exception{
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(284);
		int result = departmentDAO.delete(departmentDTO);
		assertNotEquals(1, result);
	}
	
	
}
