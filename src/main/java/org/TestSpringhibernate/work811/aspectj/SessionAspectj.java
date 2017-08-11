package org.TestSpringhibernate.work811.aspectj;
/**
* @author CC
* @version 创建时间：2017年8月11日 下午10:21:23
*/

import java.lang.reflect.Method;

import org.TestSpringhibernate.work811.utils.SessionUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SessionAspectj {

	private Session session;
	private Transaction tx;
	
	@Before(value="execution(* org.TestSpringhibernate.work811.*mag.dao.impl.*DaoImpl.*(..))")
	public void beforeAdvice(JoinPoint jp){
		Object obj = jp.getTarget();
		Class<?> cls = obj.getClass();
		try {
			Method mth = cls.getMethod("setSession", Session.class);
			session = SessionUtils.getSession();
			tx = session.beginTransaction();//开启在线事务
			mth.invoke(obj, session);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterReturning(returning="rvt",pointcut="execution(* org.TestSpringhibernate.work811.*mag.dao.impl.*DaoImpl.*(..))")
	public void afterReturningAdvice(JoinPoint jp,Object rvt){
		tx.commit();
	}
	
	@AfterThrowing(throwing="exc",pointcut="execution(* org.TestSpringhibernate.work811.*mag.dao.impl.*DaoImpl.*(..))")
	public void afterThrowingAdvice(JoinPoint jp,Object exc){
		tx.rollback();
	}
}
