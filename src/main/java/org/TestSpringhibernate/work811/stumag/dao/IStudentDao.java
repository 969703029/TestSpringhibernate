package org.TestSpringhibernate.work811.stumag.dao;

import org.TestSpringhibernate.work811.bens.Pages;
import org.TestSpringhibernate.work811.bens.StudentBean;

/**
* @author CC
* @version 创建时间：2017年8月11日 下午9:47:00
*/
public interface IStudentDao {

public void saveStuudentBean(StudentBean student);
	
	public void deleteStuudentBean2Id(StudentBean student);
	
	public void updateStuudentBean(StudentBean student);
	
	public StudentBean getStuudentBeanById(Long id);
	
	public Pages findUserListByObjectToPager(Pages page,StudentBean student);
}

