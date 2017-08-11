package org.TestSpringhibernate.work811.bens;

import java.util.List;

/**
* @author CC
* @version 创建时间：2017年8月11日 下午9:32:23
*/
public class Pages {

	private long total;//总的行数
	private long totalPage;//总的页数
	private int page;//当前的页数
	private int rows;//每页显示多少行
	private List<?> datas;
	
	public Pages(int page, int rows) {
		super();
		this.page = page;
		this.rows = rows;
	}
	public Pages() {
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		totalPage = (total % rows == 0) ? (total/rows) : (total/rows + 1);
		this.total = total;
	}
	public long getTatalpage() {
		return totalPage;
	}
	public void setTatalpage(long totalPage) {
		this.totalPage = totalPage;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public List<?> getDatas() {
		return datas;
	}
	public void setDatas(List<?> datas) {
		this.datas = datas;
	}
	@Override
	public String toString() {
		return "Pages [total=" + total + ", tatalpage=" + totalPage + ", page=" + page + ", rows=" + rows + ", datas="
				+ datas + "]";
	}
	
}

