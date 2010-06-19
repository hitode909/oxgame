package takashi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Player implements Playable {
	private InputStream in;
	private BufferedReader stdReader;
	
	class FakeInputStream extends InputStream {
		private String string;
		private int current;

		public FakeInputStream(String fakeString) {
			this.string = fakeString;
			this.current = 0;
		}

	    public int read() {
	    	if (this.current >= this.string.length() ) return 0;
	    	return this.string.codePointAt(this.current++);
	    }
	}

	public void setDummyBuffer(String string) {
		if (this.stdReader != null) {
			try {
			this.stdReader.close();
			} catch(IOException e) {
				// ignore
			}
			this.stdReader = null;
		}
		this.in = new FakeInputStream(string);
	}
	Player() {
		this.in = System.in;
	}
	public Position think(Game game) {
		// TODO Auto-generated method stub
		System.out.print(game.getBoard().toString());
		return getPositionFromHuman();
	}

	public Position getPositionFromHuman() {
		Integer x = getIntegerFromHuman();
		Integer y = getIntegerFromHuman();
		return new Position(x, y);
	}

	public Integer getIntegerFromHuman() {
		if (this.stdReader == null) {
			this.stdReader =
				new BufferedReader(new InputStreamReader(this.in));
		}
		while(true) {
			System.out.print("> ");
			String line = null;
			try {
				line = stdReader.readLine();
			} catch (IOException e) {
				System.out.println("ioexception");
				continue;
			}
			try {
				Integer got = Integer.parseInt(line);
				if (got != null) {
					return got;
				}
			} catch(NumberFormatException e) {
				continue;
			}
		}
	}
}
