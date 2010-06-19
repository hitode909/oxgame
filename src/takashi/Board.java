package takashi;

import java.util.HashMap;
import java.util.Map;

public class Board {
	private Map<Position, Stone> stones;
	private int size;
	public Board(int size) {
		this.size = size;
		stones = new HashMap<Position, Stone>();
	}
	public void putStone(Position position, Stone stone) {
		this.stones.put(position, stone);
	}
	public Stone stoneAt(Position position) {
		return this.stones.get(position);
	}

	public String toString() {
		int x;
		int y;
		String result = ""; 
		Stone stone;
		for(x = 0; x < this.size; x++) {
			for(y = 0; y < this.size; y++) {
				stone = this.stoneAt(new Position(x,y));
				if(stone != null){
					result += stone.getState();
				}else{
					result += "_";
				}
			}
			result += "\n";
		}
		return result;
	}
	public boolean isOnBoard(Position position) {
		return position.getX() >= 0 && position.getX() < this.size
			&& position.getY() >= 0 && position.getY() < this.size;
	}

	
}
