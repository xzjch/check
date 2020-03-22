package com.itree.testJunit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.itree.junit.Calculator;

import junit.framework.Assert;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();

	@BeforeClass
	public static void beforeClass() {
		System.out.println("qianqianqianqianqian");
	}

	@AfterClass
	public static void afterbeforeClass() {
		System.out.println("后后后后后后后后");
	}

	@Before
	public void setUp() throws Exception {
		calculator.clear();
		System.out.println("我是before！！！！！！！");
	}

	@After
	public void setdown() {
		System.out.println("我是after？？？？？？");
	}

	
	@Test
	public void testAdd() {
		int result = calculator.add(1, 2);
		Assert.assertEquals(3, result);
		System.out.println("我是test01");
	}

	@Test
	public void testSub() {
		int result = calculator.sub(1, 2);
		Assert.assertEquals(-1, result);
		System.out.println("我是test02");
	}


	

	//@Ignore("squareRoot() Not yet implemented")
	// 限时测试
	@Test(timeout = 10000)
	public void squareRoot() {
		calculator.squareRoot(4);
		Assert.assertEquals(12, calculator.getResult());
	}

	

	

}
