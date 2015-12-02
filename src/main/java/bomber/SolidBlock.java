package bomber;

import java.awt.Color;

import com.uqbar.vainilla.appearances.Rectangle;

public class SolidBlock extends RichGameComponent{
	
	public SolidBlock(int x, int y){
		//Apariencia de grid
		//this.setAppearance(new TileAppearrence<Tile>());
		this.setAppearance(new Rectangle(Color.BLACK, w, h));
		this.setX(x);
		this.setY(y);
	}

}
