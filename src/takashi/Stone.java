package takashi;

public class Stone {
	private String state;
	
	public Stone(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}

	public boolean isX() {
		return this.state.equals("X");
	}

	public boolean isO() {
		return this.state.equals("O");
	}
}
