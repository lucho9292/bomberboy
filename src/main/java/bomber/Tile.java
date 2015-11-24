package bomber;

import java.awt.Color;

import com.uqbar.vainilla.appearances.Rectangle;

public class Tile extends RichGameComponent {
	
	private boolean rompible = false;
	
	public Tile(boolean rompible, double x, double y){
		//this.setAppearance(new Rectangle(Color.DARK_GRAY, w, h));
		this.setAppearance(new TileAppearrence<Tile>());
		this.rompible = rompible;
		this.setX(x*w);
		this.setY(y*h);
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
