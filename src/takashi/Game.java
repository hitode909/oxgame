package takashi;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private Board board;
	private List<Playable> players;
	private int currentStep;
	public Board getBoard() {
		return board;
	}
	
	Game() {
		this.board = new Board(3);
		this.players = new ArrayList<Playable>();
		this.currentStep = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		Game game = new Game();
		Player p1 = new Player();
		Player p2 = new Player();
		game.registPlayer(p1);
		game.registPlayer(p2);
		while(true) {
			game.step();
		}
	}

	public void registPlayer(Playable player) {
		// TODO Auto-generated method stub
		this.players.add(player); 
	}

	public Playable getPlayer(int i) {
		// TODO Auto-generated method stub
		return this.players.get(i);
	}
	
	public Stone getStoneForPlayer(Playable player) {
		if (this.getPlayer(0) == player) return new Stone("O");
		return new Stone("X");
	}

	public void step() {
		Playable player = this.getPlayer(this.currentStep);
		Position position;
		while(true){
			position = player.think(this);
			if(this.board.isOnBoard(position)) {// && this.canReceiveAsNextPositionInContext(stone)) {
				break;
			}
		}
		this.board.putStone(position, this.getStoneForPlayer(player));
		this.currentStep++;
		this.currentStep %= this.players.size();
	}


}
