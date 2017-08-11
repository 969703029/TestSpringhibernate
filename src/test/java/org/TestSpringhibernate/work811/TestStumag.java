package org.TestSpringhibernate.work811;

import javax.annotation.Resource;

import org.TestSpringhibernate.work811.bens.Pages;
import org.TestSpringhibernate.work811.bens.StudentBean;
import org.TestSpringhibernate.work811.stumag.service.IStudentService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @author CC
* @version 创建时间：2017年8月11日 下午10:33:58
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class TestStumag {

	@Resource
	private IStudentService studentServiceImpl;
	
	
	
	@Test
	public void findUserListByObjectToPager(){
		Pages pg = new Pages(1,2);
		StudentBean stu = new StudentBean();
		stu.setStuName("张");
		Pages result = studentServiceImpl.findUserListByObjectToPager(pg, stu);
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
	
	
	@Ignore
	public void updateStuudentBean(){
		StudentBean stu = new StudentBean();
		stu.setId(6l);
		stu.setGender("男");
		stu.setBirthday("1999-9-9");
		stu.setStuName("张富贵");
		studentServiceImpl.updateStuudentBean(stu);
	}
	
	
	@Ignore
	public void deleteStuudentBean2Id(){
		StudentBean stu = studentServiceImpl.getStuudentBeanById(5l);
		Assert.assertNotNull(stu);
		studentServiceImpl.deleteStuudentBean2Id(stu);
	}
	
	@Ignore
	public void testSaveStudentBean(){
		
		StudentBean stu = new StudentBean();
		stu.setStuName("张中凉");
		stu.setGender("男");
		stu.setBirthday("1945-5-9");
		studentServiceImpl.saveStuudentBean(stu);
	}
	
}

