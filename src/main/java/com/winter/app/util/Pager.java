package com.winter.app.util;

public class Pager {

	private Long startRow;
	private Long lastRow;
	private Long perPage=10L; // 몇개씩 조회하냐
	private Long page;
	
	//startRow , lastRow계산하는 메서드
	public Long getPerPage() {
		return perPage;
	}


	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}


	public Long getPage() {
		if(this.page==null || this.page<1) {
			this.page=1L;
		}
		return page;
	}


	public void setPage(Long page) {
		this.page = page;
	}


	public void makeRow() {
		this.startRow=(this.getPage()-1)*this.getPerPage();
		this.lastRow=this.getPage()*this.getPerPage();

	}
	
	
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	
}
