package com.winter.app.departments;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


//import com.winter.app.employees.EmployeeDTO;




@Repository
public class DepartmentDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String namespace="com.winter.app.departments.DepartmentDAO.";
//	public void test() {
//		
//		String sql="SELECT D.* , E.FIRST_NAME "
//				+ "FROM DEPARTMENTS D "
//				+ "	 INNER JOIN "
//				+ "	 EMPLOYEES E "
//				+ "	 ON D.DEPARTMENT_ID = E.DEPARTMENT_ID "
//				+ "WHERE D.DEPARTMENT_ID =20";
//		ResultSet rs = null;
//		ArrayList<DepartmentDTO> ar = new ArrayList<DepartmentDTO>();
//		ArrayList<EmployeeDTO> ar2 = new ArrayList<EmployeeDTO>();
//		ArrayList<List<E>>
//		while(rs.next()) {
//			DepartmentDTO departmentDTO= new DepartmentDTO();
//			EmployeeDTO employeeDTO = new EmployeeDTO();
//		}
//	}
	
	//getDetail, 부서번호로 부서정보 조회
	public DepartmentDTO getDetail(DepartmentDTO departmentDTO)throws Exception{
		return sqlSession.selectOne(namespace+"getDetail", departmentDTO);
	}
	
	public List<DepartmentDTO> getList() throws Exception {
		return sqlSession.selectList(namespace+"getList");
	}
	
	public int delete(DepartmentDTO departmentDTO) throws Exception{
		return sqlSession.insert(namespace+"delete", departmentDTO);	
	}
	public int update(DepartmentDTO departmentDTO) throws Exception{
		return sqlSession.insert(namespace+"update", departmentDTO);	
	}
	public int add(DepartmentDTO departmentDTO)throws Exception{
		
		return sqlSession.insert(namespace+"add", departmentDTO);
	}
	
	
	

}
