package takashi;

import junit.framework.TestCase;

public class PositionTest extends TestCase {
	public void testProperties() {
		Position posA = new Position(1,2);

		assertEquals(1, posA.getX());
		assertEquals(2, posA.getY());
	}

	public void testEquals() {
		Position posA = new Position(1,2);
		Position posB = new Position(1,2);
		Position posC = new Position(2,3);

		assertEquals(true, posA.equals(posA));
		assertEquals(true, posA.equals(posB));
		assertEquals(false, posA.equals(posC));
	}
	
	public void testHashCode() {
		Position posA = new Position(1,2);
		Position posA2 = new Position(1,2);
		Position posB = new Position(2,3);
		assertEquals(1002, posA.hashCode());
		assertEquals(1002, posA2.hashCode());
		assertEquals(2003, posB.hashCode());
	}
}
