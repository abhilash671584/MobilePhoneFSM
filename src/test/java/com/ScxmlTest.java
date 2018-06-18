package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import abp.MobilePhone;

public class ScxmlTest {

	MobilePhone phone= null;
	@Before
	public void beforeTest() {
		 phone = new MobilePhone();
	}
	
	@Test
	public void a_checkFirstState() {
		assertEquals("idle", phone.getCurrentState().getId());
	}
	
	@Test
	public void b_checkRinging() {
		phone.fireEvent("callReceived");
		assertEquals("ringing", phone.getCurrentState().getId());
	}
	
	@Test
	public void c_checkAnswered() {
		phone.fireEvent("green");
		assertEquals("answered", phone.getCurrentState().getId());
	}
	
	@Test
	public void d_checkDisconnected() {
		phone.fireEvent("done");
		assertEquals("disconnected", phone.getCurrentState().getId());
	}
	
	
}
