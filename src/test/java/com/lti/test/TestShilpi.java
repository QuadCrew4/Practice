package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.ShilpiTest;

public class TestShilpi {
private ShilpiTest arth;
	
	@Before
	public void init() {
		arth = new ShilpiTest();
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, arth.add(4, 6));
	}
	@Test
	public void testMultiply() {
		assertEquals(24, arth.multiply(6, 4));
	}

}
