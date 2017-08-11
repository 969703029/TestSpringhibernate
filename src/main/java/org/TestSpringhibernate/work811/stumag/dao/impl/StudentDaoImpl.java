package org.TestSpringhibernate.work811.stumag.dao.impl;

import java.util.List;

import org.TestSpringhibernate.work811.bens.Pages;
import org.TestSpringhibernate.work811.bens.StudentBean;
import org.TestSpringhibernate.work811.stumag.dao.IStudentDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
* @author CC
* @version 创建时间：2017年8月11日 下午9:48:50
*/
@Repository
public class StudentDaoImpl implements IStudentDao {

	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	public void saveStuudentBean(StudentBean student) {
		// TODO Auto-generated method stub
		session.save(student);
	}

	public void deleteStuudentBean2Id(StudentBean student) {
		// TODO Auto-generated method stub
		session.delete(student);
	}

	public void updateStuudentBean(StudentBean student) {
		// TODO Auto-generated method stub
		session.update(student);
	}

	public StudentBean getStuudentBeanById(Long id) {
		// TODO Auto-generated method stub
		return (StudentBean) session.get(StudentBean.class, id);
	}

	public Pages findUserListByObjectToPager(Pages page, StudentBean student) {
		// TODO Auto-generated method stub
		String hql = "select count(s.id) from StudentBean as s where s.stuName like CONCAT(:stuName,'%')";
		Query query = session.createQuery(hql);
		query.setProperties(student);
		Long total = (Long) query.uniqueResult();
		page.setTotal(total);
		
		hql = "from StudentBean as s where s.stuName like CONCAT(:stuName,'%')";
		query = session.createQuery(hql);
		query.setProperties(student);
		query.setFirstResult(page.getPage());
		query.setMaxResults(page.getRows());
		List<?> datas = query.list();
		page.setDatas(datas);
		return page;
	}

}

