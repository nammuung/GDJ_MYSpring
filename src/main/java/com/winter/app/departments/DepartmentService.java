package com.winter.app.departments;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.regions.RegionDTO;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;
	
	
	public List<DepartmentDTO> getList() throws Exception{
		List<DepartmentDTO> ar = this.departmentDAO.getList();
		
		return ar;
	}
	
	
	//detail
	public DepartmentDTO getDetail(DepartmentDTO departmentDTO)throws Exception{
		return departmentDAO.getDetail(departmentDTO);
	}
	//insert
	public int add(DepartmentDTO departmentDTO) throws Exception{
		return departmentDAO.add(departmentDTO);
	}
	//delete
	public int delete(DepartmentDTO departmentDTO) throws Exception{
		return departmentDAO.delete(departmentDTO);
	}
	//update
	public int update(DepartmentDTO departmentDTO) throws Exception{
		return departmentDAO.update(departmentDTO);
	}
	
	
}
