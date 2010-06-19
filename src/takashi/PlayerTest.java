package takashi;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	
	public void testGetIntegerFromHuman() {
		Player player = new Player();
		player.setDummyBuffer("1\n");
		assertEquals(new Integer(1), player.getIntegerFromHuman());
		player.setDummyBuffer("\n\n\n\n\n2\n");
		assertEquals(new Integer(2), player.getIntegerFromHuman());
		player.setDummyBuffer("abc\ndef\n3\n");
		assertEquals(new Integer(3), player.getIntegerFromHuman());
		player.setDummyBuffer("1\n2\n");
		assertEquals(new Integer(1), player.getIntegerFromHuman());
		assertEquals(new Integer(2), player.getIntegerFromHuman());
	}

	public void testGetPositionFromHuman(){
		Player player = new Player();
		player.setDummyBuffer("1\n2\n");
		assertEquals(new Position(1,2), player.getPositionFromHuman());
	}

}
