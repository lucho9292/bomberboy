package bomber;

import java.awt.Color;

import com.uqbar.vainilla.GameComponent;
import com.uqbar.vainilla.appearances.Rectangle;

public class SolidBlock extends GameComponent<BombermanGameScene>{
	
	public SolidBlock(int x, int y){
		//Apariencia de grid
		//this.setAppearance(new TileAppearrence<Tile>());
		this.setAppearance(new Rectangle(Color.BLACK, 53, 46));
		this.setX(x);
		this.setY(y);
	}

}
