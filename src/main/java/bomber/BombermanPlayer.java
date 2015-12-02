package bomber;

import com.uqbar.vainilla.DeltaState;
//import com.uqbar.vainilla.appearances.Sprite;
import com.uqbar.vainilla.appearances.Rectangle;
import com.uqbar.vainilla.events.constants.Key;

import java.awt.Color;

public class BombermanPlayer extends RichGameComponent {

	public BombermanPlayer(Color c) {
		this.setAppearance(new Rectangle(c, w, h));
		// this.setAppearance(Sprite.fromImage("\\png\\ff3warrior.png").scale(0.8));
	}

	public void dropBomb(DeltaState ds) {
		// crear una bomba en la posicion actual
		Bomba b = new Bomba(this.getX(), this.getY());
		this.getScene().addComponent(b);
	}

	@Override
	public void onSceneActivated() {
		this.setX(w);
		this.setY(h);
	}

	@Override
	public void update(DeltaState deltaState) {
		checkKeys(deltaState);
		// int beforeXPos = (int) getX();
		// int beforeYPos = (int) getY();
		//
		 
	}
	
	public void checkCollision(DeltaState state){
		
	}

	public void checkKeys(DeltaState state) {
		// speed.x1 = 0
		if (state.isKeyBeingHold(Key.LEFT)) {
			this.setX(this.getX()-0.2);
		}
		if (state.isKeyBeingHold(Key.RIGHT)) {
			this.setX(this.getX()+0.2);
		}

		if (state.isKeyBeingHold(Key.UP)) {
			this.setY(this.getY()-0.2);
		}

		if (state.isKeyBeingHold(Key.DOWN)) {
			this.setY(this.getY()+0.2);
		}
		if (state.isKeyBeingHold(Key.A)) {
			 this.dropBomb(state);
		}
	}

	public boolean checkIfHasCollide() {
		return false;
	}

}
