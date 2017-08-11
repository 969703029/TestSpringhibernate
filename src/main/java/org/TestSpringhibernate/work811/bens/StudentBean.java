package org.TestSpringhibernate.work811.bens;

import java.io.Serializable;

/**
* @author CC
* @version 创建时间：2017年8月11日 下午9:28:12
*/
public class StudentBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1386395180094545251L;
	
	private Long id;
	private String stuName;
	private String gender;
	private String birthday;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", stuName=" + stuName + ", gender=" + gender + ", birthday=" + birthday + "]";
	}
	
	
}

