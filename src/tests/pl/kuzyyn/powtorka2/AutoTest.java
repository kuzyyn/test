package tests.pl.kuzyyn.powtorka2;

import static org.junit.Assert.*;

import org.junit.Test;

import main.pl.kuzyyn.powtorka2.Auto;

public class AutoTest {

	
	@Test
	public void shouldReturn50(){
		Auto auto = new Auto("audi");
		
		assertTrue(50==auto.getWeight());
	}
	@Test
	public void shouldReturnModel(){
		Auto auto = new Auto("audi");
		
		assertTrue("audi"==auto.getModel());
	}
	
	
}
