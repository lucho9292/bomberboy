package bomber;

import java.awt.Color;

import com.uqbar.vainilla.GameComponent;
import com.uqbar.vainilla.appearances.Rectangle;

public class Pared extends GameComponent<BombermanGameScene> {
	public Pared(boolean bool, double x, double y){
		//el boolean indica la orientacion de la pared
		if (bool) 
			{this.setAppearance(new Rectangle(Color.BLACK,20,600));}
			else {this.setAppearance(new Rectangle(Color.BLACK,800,20));}
		this.setX(x);
		this.setY(y);
	}
	
}
