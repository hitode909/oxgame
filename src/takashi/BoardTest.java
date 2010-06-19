package takashi;

import junit.framework.TestCase;

public class BoardTest extends TestCase {

	public void testStoneAt() {
		Board board = new Board(3);
		Position posA = new Position(1, 2);
		Position posA2 = new Position(1, 2);
		Position posB = new Position(1, 3);
		Stone stoneA = new Stone("X");
		board.putStone(posA, stoneA);
		assertEquals(stoneA, board.stoneAt(posA));
		assertEquals(null, board.stoneAt(posB));
		assertEquals(stoneA, board.stoneAt(posA2));
	}

	public void testToString() {
		Board board = new Board(2);
		board.putStone(new Position(0,1), new Stone("X"));
		board.putStone(new Position(1,1), new Stone("O"));
		
		String expect = "_X\n_O\n";
		assertEquals(expect, board.toString());
	}
}
