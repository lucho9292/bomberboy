package bomber;

import com.uqbar.vainilla.DeltaState;
//import com.uqbar.vainilla.appearances.Sprite;
import com.uqbar.vainilla.appearances.Rectangle;
import com.uqbar.vainilla.events.constants.Key;

import java.awt.Color;

public class Player extends RichGameComponent {

	double speed;
	public int bombs; // la cantidad de bombas
	private int power; // el poder de las bombas

	public Player(Color c) {
		this.speed = 0.5;
		this.bombs = 1;
		this.power = 1;
		this.setZ(10);
		this.setAppearance(new Rectangle(c, w, h));
		// this.setAppearance(Sprite.fromImage("\\png\\ff3warrior.png").scale(0.8));
	}

	public void dropBomb(DeltaState ds) {
		// crear una bomba en la posicion actual
		if (this.bombs >= 1) {
			this.bombs--;
			Bomba b = new Bomba(this, calculateTileCenter()[0], calculateTileCenter()[1]);
			this.getScene().addComponent(b);
		}
	}

	public int getPower() {
		return this.power;
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

	// restringe el movimiento del personaje no contempla los limites del campo
	// de juego
	public boolean isAllignedTo(double cp, int i) {
		return Math.abs((cp % (i * 2)) - i) < 1;// esto es por problemas de
													// presicion, sino uso ==
	}

	// establece los limites del campo de juego
	public boolean inFieldLimit() {
		return 53 <= this.getX() && this.getX() <= 690 && 46 <= this.getY() && this.getY() <= 507;
	}

	// corrige la posicion del jugador por si se pasa del borde
	public void fixPosition(double x, double y) {
		if (!inFieldLimit()) {
			this.setX(x);
			this.setY(y);
		}
	}

	public void checkKeys(DeltaState state) {
		double x = this.getX();
		double y = this.getY();
		if (state.isKeyBeingHold(Key.LEFT) && isAllignedTo(this.getY(), h) && inFieldLimit()) {
			this.setX(this.getX() - speed);
			fixPosition(x, y);
		}

		if (state.isKeyBeingHold(Key.UP) && isAllignedTo(this.getX(), w) && inFieldLimit()) {
			this.setY(this.getY() - speed);
			fixPosition(x, y);
		}
		if (state.isKeyBeingHold(Key.RIGHT) && isAllignedTo(this.getY(), h) && inFieldLimit()) {
			this.setX(this.getX() + speed);
			fixPosition(x, y);
		}

		if (state.isKeyBeingHold(Key.DOWN) && isAllignedTo(this.getX(), w) && inFieldLimit()) {
			this.setY(this.getY() + speed);
			fixPosition(x, y);
		}
		if (state.isKeyPressed(Key.A)) {
			this.dropBomb(state);

		}
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public boolean checkIfHasCollide() {
		return false;
	}

}