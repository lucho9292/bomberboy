package bomber;

import com.uqbar.vainilla.GameComponent;

public class Tile extends GameComponent<BombermanGameScene> {
	
	private boolean rompible = false;
	
	public Tile(boolean rompible, double x, double y){
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
