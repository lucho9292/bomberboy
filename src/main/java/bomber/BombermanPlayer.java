package bomber;

import com.uqbar.vainilla.DeltaState;
//import com.uqbar.vainilla.appearances.Sprite;
import com.uqbar.vainilla.appearances.Rectangle;
import com.uqbar.vainilla.events.constants.Key;

import java.awt.Color;

public class BombermanPlayer extends RichGameComponent {
	
	public BombermanPlayer(Color c){
		this.setAppearance(new Rectangle(c, rate, rate));
		//this.setAppearance(Sprite.fromImage("\\png\\ff3warrior.png").scale(0.8));		
	}
	
	public void dropBomb(DeltaState ds){
		//crear una bomba en la posicion actual
		Bomba b = new Bomba(this.getX(),this.getY());
		this.getScene().addComponent(b);
	}
	
	@Override
	public void onSceneActivated(){
		this.setX(rate);
		this.setY(rate);
	}
	
	@Override
	public void update(DeltaState deltaState) {
		
		if (deltaState.isKeyPressed(Key.A)){
			this.dropBomb(deltaState);
		}
		
		//Keyboard movements
		if (deltaState.isKeyPressed(Key.LEFT)){
			this.setX(this.getX()-rate);
		}
		if (deltaState.isKeyPressed(Key.RIGHT)){
			this.setX(this.getX()+rate);
		}
		if (deltaState.isKeyPressed(Key.UP)){
			this.setY(this.getY()-rate);
		}
		if (deltaState.isKeyPressed(Key.DOWN)){
			this.setY(this.getY()+rate);
		}
	}

}
