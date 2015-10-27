package bomber;

import com.uqbar.vainilla.DeltaState;
import com.uqbar.vainilla.GameComponent;
//import com.uqbar.vainilla.appearances.Sprite;
import com.uqbar.vainilla.appearances.Rectangle;
import com.uqbar.vainilla.events.constants.Key;

import java.awt.Color;

public class BombermanPlayer extends GameComponent<BombermanGameScene> {
	
	public BombermanPlayer(Color c){
		this.setAppearance(new Rectangle(c, 30, 30));
		//this.setAppearance(Sprite.fromImage("\\png\\ff3warrior.png").scale(0.8));
		this.setX(200);
		this.setY(200);
		
	}
	
	//Keyboard movements
	public void update(DeltaState deltaState) {
		if (deltaState.isKeyPressed(Key.LEFT)){
			this.setX(this.getX()-30);
		}
		if (deltaState.isKeyPressed(Key.RIGHT)){
			this.setX(this.getX()+30);
		}
		if (deltaState.isKeyPressed(Key.UP)){
			this.setY(this.getY()-30);
		}
		if (deltaState.isKeyPressed(Key.DOWN)){
			this.setY(this.getY()+30);
		}
	}

}
