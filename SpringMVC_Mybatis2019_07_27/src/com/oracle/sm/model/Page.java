package com.oracle.sm.model;

public class Page {
	/**
	 * 分页查询的参数
	 */
	public int npage;
	public int pageSize;
	public int getNpage() {
		return npage;
	}
	public void setNpage(int npage) {
		this.npage = npage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public Page(int npage, int pageSize) {
		super();
		this.npage = npage;
		this.pageSize = pageSize;
	}
	
	

}
