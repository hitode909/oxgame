package takashi;

import junit.framework.TestCase;

public class GameTest extends TestCase {
	public void testConstructor() {
		Game game = new Game();
		assertTrue(game instanceof Game);
		assertTrue(game.getBoard() instanceof Board);
	}
	
	public void testPlayers() {
		Game game = new Game();
		Player p1 = new Player();
		Player p2 = new Player();
		game.registPlayer(p1);
		game.registPlayer(p2);
		assertEquals(p1, game.getPlayer(0));
		assertEquals(p2, game.getPlayer(1));
	}
	
	public void testTurn() {
		Game game = new Game();
		Player p1 = new Player();
		Player p2 = new Player();
		game.registPlayer(p1);
		game.registPlayer(p2);
		assertEquals("___\n___\n___\n", game.getBoard().toString());
		p1.setDummyBuffer("0\n0\n");
		game.step();
		assertEquals("O__\n___\n___\n", game.getBoard().toString());
		p2.setDummyBuffer("1\n0\n");
		game.step();
		assertEquals("O__\nX__\n___\n", game.getBoard().toString());
	}
}
