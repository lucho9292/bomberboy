package bomber;

import java.awt.Color;

import com.uqbar.vainilla.DeltaState;
import com.uqbar.vainilla.appearances.Circle;

public class Fuego extends RichGameComponent {
	private double elapsed = 0.0;
	private double countdown = 0.6;
	private Tile tile;

	public Fuego(double x, double y) {
		this.setX(x);
		this.setY(y);
		this.setAppearance(new Circle(Color.RED, 20));
	}

	public Tile getTile() {
		return tile;
	}

	public Fuego() {
		this.setAppearance(new Circle(Color.RED, 20));
	}

	public void destruirTiles(DeltaState ds) {
		int x = (int) Math.round(this.getX());
		int y = (int) Math.round(this.getY());
		this.tile = this.getScene().getTileMap().getTile(x / w, y / h);
		this.tile.agregarEmptyBlock(new EmptyBlock());
	}

	public void update(DeltaState ds) {
		this.elapsed += ds.getDelta();
		if (elapsed >= countdown) {
			this.destruirTiles(ds);
			this.destroy();
		}
	}
}
