package takashi;

import junit.framework.TestCase;

public class StoneTest extends TestCase {

	
	public void testGetState() {
		Stone stoneA = new Stone("X");
		assertEquals("X", stoneA.getState());

		Stone stoneB = new Stone("O");
		assertEquals("O", stoneB.getState());
	}
	
	public void testIs() {
		Stone stoneA = new Stone("X");
		assertEquals(true, stoneA.isX());
		assertEquals(false, stoneA.isO());

		Stone stoneB = new Stone("O");
		assertEquals(false, stoneB.isX());
		assertEquals(true, stoneB.isO());
	}
	
}
