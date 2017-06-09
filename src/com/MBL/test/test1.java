package com.MBL.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.MBL.domain.User;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resource="conf.xml";
		
		InputStream is=test1.class.getClassLoader().getResourceAsStream(resource);
		
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		
		SqlSession session = sessionFactory.openSession();
		
		String statement="com.MBL.mapping.userMapper.getUser";
		
		User user=session.selectOne(statement,1);
		System.out.println(user);
	}
}
