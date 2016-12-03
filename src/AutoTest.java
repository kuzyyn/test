import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pierwszy.Auto;
import pierwszy.Maszyna;

public class AutoTest {

	
	@Test
	public void inAiMTest(){
		Maszyna autoM = new Auto();
		int weight = autoM.getWeight();
		assertEquals(50,weight);
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
