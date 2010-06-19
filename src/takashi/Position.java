package takashi;

public class Position implements hasXY {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}


	Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object a) {
		if (a instanceof Position) {
			Position position = (Position)a;
			return (this.x == position.getX()
					&& this.y == position.getY()
					);
		} else {
			return super.equals(a);
		}
	}
	
	public int hashCode() {
		return this.x * 1000 + this.y;	
	}
	
	public static void main(String[] args) {
		Position posA = new Position(1,2);
		Position posB = new Position(1,2);
		Position posC = new Position(2,3);
		
		if (posA.equals(posB)) {
			System.out.println("AとBは同じ");
		} else {
			System.out.println("AとBは同じではない");
		}
		if (posA.equals(posC)) {
			System.out.println("AとCは同じ");
		} else {
			System.out.println("AとCは同じではない");
		}
	}
}
