package org.TestSpringhibernate.work811.stumag.service.impl;

import javax.annotation.Resource;

import org.TestSpringhibernate.work811.bens.Pages;
import org.TestSpringhibernate.work811.bens.StudentBean;
import org.TestSpringhibernate.work811.stumag.dao.IStudentDao;
import org.TestSpringhibernate.work811.stumag.service.IStudentService;
import org.springframework.stereotype.Service;

/**
* @author CC
* @version 创建时间：2017年8月11日 下午9:47:54
*/
@Service
public class StudentServiceImpl implements IStudentService {

	@Resource
	private IStudentDao studentDaoImpl;
	
	
	public void saveStuudentBean(StudentBean student) {
		// TODO Auto-generated method stub
		studentDaoImpl.saveStuudentBean(student);
	}

	public void deleteStuudentBean2Id(StudentBean student) {
		// TODO Auto-generated method stub
		studentDaoImpl.deleteStuudentBean2Id(student);
	}

	public void updateStuudentBean(StudentBean student) {
		// TODO Auto-generated method stub
		studentDaoImpl.updateStuudentBean(student);
	}

	public StudentBean getStuudentBeanById(Long id) {
		// TODO Auto-generated method stub
		return studentDaoImpl.getStuudentBeanById(id);
	}

	public Pages findUserListByObjectToPager(Pages page, StudentBean student) {
		// TODO Auto-generated method stub
		return studentDaoImpl.findUserListByObjectToPager(page, student);
	}

}

