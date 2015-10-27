package bomber;

import java.awt.Color;

import com.uqbar.vainilla.GameComponent;
import com.uqbar.vainilla.appearances.Rectangle;

public class Tile extends GameComponent<BombermanGameScene> {
	
	private boolean rompible = false;
	
	public Tile(boolean rompible, double x, double y){
		this.setAppearance(new Rectangle(Color.DARK_GRAY, 30, 30));
		this.rompible = rompible;
		this.setX(x);
		this.setY(y);
	}
	
	public boolean esRompible(){
		return rompible;
	}
	
	public void destroyTile(){
		if (this.esRompible()){
			this.destroy();
		}
	}
}
