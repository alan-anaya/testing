package com.softtek.apptesting;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{
	App mytest = new App();

	@Test
	public void Suma_Test(){
		assertEquals(4, mytest.Suma(1,3));
	}
	
	@Test
	public void Resta_Test(){
		assertEquals(4, mytest.Resta(8,4));
	}
}
