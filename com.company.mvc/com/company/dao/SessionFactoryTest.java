package com.company.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.company.dao.util.SessionFactory;

public class SessionFactoryTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("begin..........");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("stop...........");
	}

	@Test
	public void test() {
		try {
			System.out.println(SessionFactory.getSession().toString());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
